{ pkgs, lib, config, inputs, ... }:

{
  packages = [
    pkgs.git
    pkgs.just
  ];

  languages.dotnet.enable = true;
}
