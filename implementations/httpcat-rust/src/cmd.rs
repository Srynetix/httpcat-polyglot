use anyhow::Result;
use clap::Parser;
use reqwest::StatusCode;

use crate::logic::{
    convert_image_to_ascii, fetch_pet_code_image_as_bytes, is_status_code_valid, PetType,
};

#[derive(Debug, Parser)]
pub struct Cmd {
    /// HTTP status code.
    status_code: StatusCode,
    /// Use if you prefer dogs.
    #[arg(long)]
    dog: bool,
    /// Image width.
    #[arg(long, default_value = "100")]
    width: u32,
    /// Image height.
    #[arg(long, default_value = "50")]
    height: u32,
}

pub async fn run() -> Result<()> {
    let args = Cmd::parse();
    let pet_type = if args.dog { PetType::Dog } else { PetType::Cat };

    if !is_status_code_valid(args.status_code) {
        return Err(anyhow::anyhow!(
            "Unsupported status code {}",
            args.status_code
        ));
    }

    let bytes = fetch_pet_code_image_as_bytes(pet_type, args.status_code).await?;
    println!(
        "{}",
        convert_image_to_ascii(bytes, args.width, args.height).await?
    );

    Ok(())
}
