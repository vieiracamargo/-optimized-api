package com.github.vieiracamargo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Embeddable
public class Author {
    @Column(name ="name")
    private String name;
    @Column(name ="youtube_channel")
    private String youTubeChannel;
    @Column(name ="video_link")
    private String videoLink;
}
