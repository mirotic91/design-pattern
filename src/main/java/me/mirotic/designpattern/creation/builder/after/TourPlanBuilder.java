package me.mirotic.designpattern.creation.builder.after;


import me.mirotic.designpattern.creation.builder.before.DetailPlan;
import me.mirotic.designpattern.creation.builder.before.TourPlan;

import java.time.LocalDate;


/**
 * Builder
 */
public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder dayAndNights(Integer day, Integer nights);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder addPlan(DetailPlan plan);

    TourPlan build();
}
