{ pkgs, lib, config, inputs, ... }:

{
  # https://devenv.sh/basics/
  packages = [
    pkgs.git
    pkgs.just
  ];

  # https://devenv.sh/services/
  # services.postgres.enable = true;

  # https://devenv.sh/languages/
  # languages.nix.enable = true;
  languages.javascript.enable = true;
  languages.javascript.npm.enable = true;

  # https://devenv.sh/pre-commit-hooks/
  # pre-commit.hooks.shellcheck.enable = true;

  # https://devenv.sh/processes/
  # processes.ping.exec = "ping example.com";

  # See full reference at https://devenv.sh/reference/options/
}
