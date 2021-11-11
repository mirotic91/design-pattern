package me.mirotic.designpattern.creation.builder.before;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class TourPlan {

    private boolean vip;

    private String title;

    private Integer nights;

    private Integer days;

    private LocalDate startDate;

    private List<DetailPlan> plans;


    public void addPlan(DetailPlan plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }
        this.plans.add(plan);
    }

}
