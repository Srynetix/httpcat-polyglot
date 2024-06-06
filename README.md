# http.cat polyglot project

Implement a simple http.cat/http.dog client in various programming languages and technologies, as a learning exercise.

## Expectations

For each language / technology included in "implementations", the app should:

- expose a command-line interface to query http.cat or http.dog,
- validate the HTTP status code,
- display the resulting picture as ASCII art in the terminal.

The code should be clear, documented, and as idiomatic as possible.

I will try to sum up my experience with each technology in each implementation README.
Each implementation will use nix/direnv/devenv to easily switch between tools.

## Available implementations

- [Go](./implementations/httpcat-go/)
- [Python](./implementations/httpcat-python/)
- [Rust](./implementations/httpcat-rust/)
- [Deno/TypeScript](./implementations/httpcat-deno/)
- [Node/TypeScript](./implementations/httpcat-node/)
- [Dart](./implementations/httpcat-dart/)
- [Java](./implementations/httpcat-java/)
- [Kotlin](./implementations/httpcat-kotlin/)

## Roadmap

- C#/.NET
- Swift
- Elixir
- Zig
- C
- C++