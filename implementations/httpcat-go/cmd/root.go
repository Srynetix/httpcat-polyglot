package cmd

import (
	"errors"
	"fmt"
	"os"
	"strconv"

	"github.com/Srynetix/httpcat/logic"

	"github.com/spf13/cobra"
)

var dogMode bool
var width int
var height int

var rootCmd = &cobra.Command{
	Use:   "httpcat [http status code]",
	Short: "http.cat client",
	Long:  "A simple, stupid client for http.cat made in Go.",
	Args: func(cmd *cobra.Command, args []string) error {
		if len(args) != 1 {
			return errors.New("http status code missing")
		}

		status, err := strconv.Atoi(args[0])
		if err != nil {
			return fmt.Errorf("%s", err)
		}

		if !logic.IsStatusCodeValid(status) {
			return errors.New("unknown http status code")
		}

		return nil
	},
	Run: func(cmd *cobra.Command, args []string) {
		status, err := strconv.Atoi(args[0])
		if err != nil {
			panic(err)
		}

		var petType logic.PetType = logic.Cat
		if dogMode {
			petType = logic.Dog
		}

		fmt.Println(logic.StatusCodeToTerminalString(petType, status, width, height))
	},
}

func init() {
	rootCmd.Flags().IntVar(&width, "width", 100, "image width")
	rootCmd.Flags().IntVar(&height, "height", 50, "image height")
	rootCmd.Flags().BoolVar(&dogMode, "dog", false, "use if you prefer dogs")
}

func Execute() {
	if err := rootCmd.Execute(); err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
}
