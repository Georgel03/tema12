package org.fasttrackit.tema12.Days;

public class DaySchedule {

    private DaysOfWeek days;

    private String activity;

    public DaySchedule(DaysOfWeek days, String activity) {
        this.days = days;
        this.activity = activity;
    }

    public DaysOfWeek getDays() {
        return this.days;
    }

    public String getActivity() {
        return this.activity;
    }




}
