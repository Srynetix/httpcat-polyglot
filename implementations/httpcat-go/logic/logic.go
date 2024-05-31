package logic

import (
	"fmt"
	"image"
	"io"
	"net/http"

	"github.com/qeesung/image2ascii/convert"
)

type PetType int32

const (
	Cat PetType = 0
	Dog PetType = 1
)

const (
	httpCatRootUrl string = "https://http.cat"
	httpDogRootUrl string = "https://http.dog"
)

func getPetImageUrl(petType PetType, statusCode int) string {
	if petType == Cat {
		return fmt.Sprintf("%s/images/%d.jpg", httpCatRootUrl, statusCode)
	} else {
		return fmt.Sprintf("%s/%d.jpg", httpDogRootUrl, statusCode)
	}
}

func getPetImage(petType PetType, statusCode int) io.Reader {
	resp, err := http.Get(getPetImageUrl(petType, statusCode))
	if err != nil {
		panic(err)
	}

	return resp.Body
}

func IsStatusCodeValid(statusCode int) bool {
	return http.StatusText(statusCode) != ""
}

func imageDataToAscii(reader io.Reader, width int, height int) string {
	img, _, err := image.Decode(reader)
	if err != nil {
		panic(err)
	}

	options := convert.DefaultOptions
	options.FixedWidth = width
	options.FixedHeight = height

	converter := convert.NewImageConverter()
	return converter.Image2ASCIIString(img, &options)
}

func StatusCodeToTerminalString(petType PetType, statusCode int, width int, height int) string {
	data := getPetImage(petType, statusCode)
	return imageDataToAscii(data, width, height)
}
