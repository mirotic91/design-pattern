package me.mirotic.designpattern.creation.builder;

import me.mirotic.designpattern.creation.builder.after.DefaultTourPlanBuilder;
import me.mirotic.designpattern.creation.builder.after.TourDirector;
import me.mirotic.designpattern.creation.builder.after.VipTourPlanBuilder;
import me.mirotic.designpattern.creation.builder.before.DetailPlan;
import me.mirotic.designpattern.creation.builder.before.TourPlan;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BuilderTest {

    @Test
    void before() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("영국 축구투어");
        tourPlan.setDays(2);
        tourPlan.setNights(3);
        tourPlan.setStartDate(LocalDate.now());
        tourPlan.addPlan(new DetailPlan(1, LocalTime.NOON, Boolean.TRUE, "Emirates Stadium Tour"));
        tourPlan.addPlan(new DetailPlan(2, LocalTime.NOON, Boolean.FALSE, "Arsenal vs Tottenham Game"));

        System.out.println(tourPlan);
        assertFalse(tourPlan.isVip());
    }

    @Test
    void after_builder() {
        TourPlan spainFootballTour = new DefaultTourPlanBuilder()
                .title("스페인 축구투어")
                .startDate(LocalDate.now().plusWeeks(4))
                .build();
        System.out.println(spainFootballTour);
        assertFalse(spainFootballTour.isVip());

        TourPlan germanyFootballTour = new VipTourPlanBuilder()
                .title("독일 축구투어")
                .dayAndNights(4, 5)
                .startDate(LocalDate.now().plusWeeks(1))
                .addPlan(new DetailPlan(1, LocalTime.NOON, Boolean.FALSE, "Allianz Arena Mega Store Tour"))
                .build();
        System.out.println(germanyFootballTour);
        assertTrue(germanyFootballTour.isVip());
    }

    @Test
    void after_director() {
        TourDirector tourDirector = new TourDirector(new DefaultTourPlanBuilder());
        TourPlan spainFootballTour = tourDirector.spainFootballTour();
        System.out.println(spainFootballTour);
        assertFalse(spainFootballTour.isVip());

        TourDirector vipTourDirector = new TourDirector(new VipTourPlanBuilder());
        TourPlan germanyFootballTour = vipTourDirector.germanyFootballTour();
        System.out.println(germanyFootballTour);
        assertTrue(germanyFootballTour.isVip());
    }
}