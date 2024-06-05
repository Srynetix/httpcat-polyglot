{ pkgs, lib, config, inputs, ... }:

{
  packages = [
    pkgs.git
    pkgs.just
    pkgs.jdk21_headless
    pkgs.gradle
  ];
}
