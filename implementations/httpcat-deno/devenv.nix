{ pkgs, lib, config, inputs, ... }:

{
  # https://devenv.sh/basics/
  # https://devenv.sh/packages/
  packages = [
    pkgs.git
    pkgs.just
    pkgs.deno
  ];

  # https://devenv.sh/services/
  # services.postgres.enable = true;

  # https://devenv.sh/languages/

  # https://devenv.sh/pre-commit-hooks/
  # pre-commit.hooks.shellcheck.enable = true;

  # https://devenv.sh/processes/
  # processes.ping.exec = "ping example.com";

  # See full reference at https://devenv.sh/reference/options/
}
