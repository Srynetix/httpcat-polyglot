using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Net;
using Spectre.Console.Cli;

namespace HttpCat;

public class Cmd {
    public static int Run(string[] args) {
        var app = new CommandApp<HttpCatCmd>();
        app.Configure(config => {
            config.SetApplicationName("httpcat-net");
        });
        return app.Run(args);
    }
}

internal sealed class HttpCatCmd: Command<HttpCatCmd.Settings>
{
    public sealed class Settings: CommandSettings
    {
        [Description("HTTP status code to fetch.")]
        [CommandArgument(0, "<HTTP status code>")]
        public int StatusCode { get; init; }

        [Description("Use if you prefer dogs.")]
        [CommandOption("--dog")]
        public bool Dog { get; init; }

        [Description("Image width.")]
        [CommandOption("--width")]
        [DefaultValue(100)]
        public int Width { get; init; }
    }

    public override int Execute(CommandContext context, Settings settings)
    {
        var task = Task.Run(async () => await ExecuteAsync(context, settings));
        return task.Result;
    }

    public static async Task<int> ExecuteAsync(CommandContext context, Settings settings) {
        var petType = PetType.Cat;
        if (settings.Dog) {
            petType = PetType.Dog;
        }

        var imageData = await Logic.FetchPetCodeImage(petType, settings.StatusCode);
        // Console.WriteLine(imageData.Length);

        Console.WriteLine(Logic.ConvertImageToAscii(imageData, settings.Width));

        return 0;
    }
}