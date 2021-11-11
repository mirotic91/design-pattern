package me.mirotic.designpattern.creation.builder.before;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class DetailPlan {

    private Integer day;

    private LocalTime time;

    private Boolean withGuide;

    private String description;

}
