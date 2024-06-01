import typer

from httpcat.cmd import cmd_main


def main():
    typer.run(cmd_main)


if __name__ == "__main__":
    main()
