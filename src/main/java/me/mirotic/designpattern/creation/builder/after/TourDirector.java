package me.mirotic.designpattern.creation.builder.after;


import me.mirotic.designpattern.creation.builder.before.DetailPlan;
import me.mirotic.designpattern.creation.builder.before.TourPlan;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 * Director
 */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }


    public TourPlan spainFootballTour() {
        return tourPlanBuilder
                .title("스페인 축구투어")
                .startDate(LocalDate.now().plusWeeks(1))
                .build();
    }

    public TourPlan germanyFootballTour() {
        return tourPlanBuilder
                .title("독일 축구투어")
                .dayAndNights(2, 3)
                .startDate(LocalDate.now().plusMonths(3))
                .addPlan(new DetailPlan(1, LocalTime.NOON, Boolean.TRUE, "Allianz Arena Mega Store Tour"))
                .addPlan(new DetailPlan(2, LocalTime.NOON, Boolean.FALSE, "Allianz Arena Home Game"))
                .build();
    }

}
