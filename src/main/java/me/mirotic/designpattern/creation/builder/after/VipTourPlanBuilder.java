package me.mirotic.designpattern.creation.builder.after;


import me.mirotic.designpattern.creation.builder.before.DetailPlan;
import me.mirotic.designpattern.creation.builder.before.TourPlan;

import java.time.LocalDate;


/**
 * Concrete Builder
 */
public class VipTourPlanBuilder implements TourPlanBuilder {

    private TourPlan tourPlan = new TourPlan();


    @Override
    public VipTourPlanBuilder title(String title) {
        tourPlan.setTitle("[VIP] " + title);
        return this;
    }

    @Override
    public TourPlanBuilder dayAndNights(Integer day, Integer nights) {
        tourPlan.setDays(day);
        tourPlan.setNights(nights);
        return this;
    }

    @Override
    public VipTourPlanBuilder startDate(LocalDate startDate) {
        tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(DetailPlan plan) {
        tourPlan.addPlan(plan);
        return this;
    }

    @Override
    public TourPlan build() {
        tourPlan.setVip(true);
        return tourPlan;
    }
}
