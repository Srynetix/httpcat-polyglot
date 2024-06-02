use std::io::Cursor;

use anyhow::Result;
use image::ImageFormat;
use reqwest::StatusCode;

pub enum PetType {
    Cat,
    Dog,
}

const HTTP_CAT_ROOT_URL: &str = "https://http.cat";
const HTTP_DOG_ROOT_URL: &str = "https://http.dog";

pub fn get_pet_code_image_url(pet_type: PetType, status_code: StatusCode) -> String {
    match pet_type {
        PetType::Cat => format!("{HTTP_CAT_ROOT_URL}/images/{}.jpg", status_code.as_u16()),
        PetType::Dog => format!("{HTTP_DOG_ROOT_URL}/{}.jpg", status_code.as_u16()),
    }
}

pub async fn fetch_pet_code_image_as_bytes(
    pet_type: PetType,
    status_code: StatusCode,
) -> Result<Vec<u8>> {
    let response = reqwest::get(get_pet_code_image_url(pet_type, status_code))
        .await
        .unwrap();
    Ok(response.bytes().await?.to_vec())
}

pub async fn convert_image_to_ascii(
    image_data: Vec<u8>,
    width: u32,
    height: u32,
) -> Result<String> {
    tokio::task::spawn_blocking(move || {
        let mut img_reader = image::io::Reader::new(Cursor::new(image_data));
        img_reader.set_format(ImageFormat::Jpeg);

        let mut buffer = String::new();
        let img = img_reader.decode()?;

        rascii_art::render_image_to(
            &img,
            &mut buffer,
            &rascii_art::RenderOptions {
                width: Some(width),
                height: Some(height),
                colored: true,
                ..Default::default()
            },
        )?;

        Ok::<_, anyhow::Error>(buffer)
    })
    .await?
}

pub fn is_status_code_valid(status_code: StatusCode) -> bool {
    status_code.canonical_reason().is_some()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_get_pet_code_image_url() {
        assert_eq!(
            get_pet_code_image_url(PetType::Cat, StatusCode::OK),
            "https://http.cat/images/200.jpg"
        );
        assert_eq!(
            get_pet_code_image_url(PetType::Dog, StatusCode::OK),
            "https://http.dog/200.jpg"
        );
    }

    #[test]
    fn test_is_status_code_valid() {
        assert!(is_status_code_valid(StatusCode::OK));
        assert!(!is_status_code_valid(StatusCode::from_u16(318).unwrap()));
    }
}
