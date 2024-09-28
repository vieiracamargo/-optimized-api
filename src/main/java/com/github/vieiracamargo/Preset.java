package com.github.vieiracamargo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "presets")
public class Preset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name ="texture")
    @Enumerated(EnumType.STRING)
    private Level texture;

    @Column(name ="models")
    @Enumerated(EnumType.STRING)
    private Level models;

    @Column(name ="anisotropic_filter")
    @Enumerated(EnumType.STRING)
    private Level anisotropicFilter;

    @Column(name ="lighting")
    @Enumerated(EnumType.STRING)
    private Level lighting;

    @Column(name ="shadows")
    @Enumerated(EnumType.STRING)
    private Level shadows;

    @Column(name ="reflections")
    @Enumerated(EnumType.STRING)
    private Level reflections;

    @Column(name ="atmospherics")
    @Enumerated(EnumType.STRING)
    private Level atmospherics;

    @Column(name ="ambient_oclusion")
    @Enumerated(EnumType.STRING)
    private Level ambientOclusion;

    @Column(name ="tessellation")
    @Enumerated(EnumType.STRING)
    private Level tessellation;

    @Embedded
    private Author author;
}
