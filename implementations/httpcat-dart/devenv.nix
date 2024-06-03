{ pkgs, lib, config, inputs, ... }:

{
  packages = [
    pkgs.git
    pkgs.just
  ];

  languages.dart.enable = true;
}
