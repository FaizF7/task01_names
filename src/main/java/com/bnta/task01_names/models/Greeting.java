package com.bnta.task01_names.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Greeting {
    private String name;
    private String  timeOfDay;


    public Greeting(String name, String localTime ) {
        this.name = name;
        this.timeOfDay = localTime;

    }

    public Greeting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
