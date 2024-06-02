mod cmd;
mod logic;

#[tokio::main(flavor = "current_thread")]
async fn main() {
    if let Err(e) = cmd::run().await {
        eprintln!("ERROR: {e}");
        std::process::exit(1);
    }
}
