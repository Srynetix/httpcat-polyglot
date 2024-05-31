package logic

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestGetPetImageUrl(t *testing.T) {
	assert.Equal(t, getPetImageUrl(Cat, 100), "https://http.cat/images/100.jpg")
	assert.Equal(t, getPetImageUrl(Cat, 400), "https://http.cat/images/400.jpg")
	assert.Equal(t, getPetImageUrl(Dog, 400), "https://http.dog/400.jpg")
}

func TestIsStatusCdoeValid(t *testing.T) {
	assert.True(t, IsStatusCodeValid(100))
	assert.False(t, IsStatusCodeValid(1))
}
