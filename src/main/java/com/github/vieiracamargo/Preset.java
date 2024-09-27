package com.github.vieiracamargo;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Preset {
    private Level texture;
    private Level models;
    private Level anisotropicFilter;
    private Level lighting;
    private Level shadows;
    private Level reflections;
    private Level atmospherics;
    private Level ambientOclusion;
    private Level tessellation;
    private String author;
}
