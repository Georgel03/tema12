package org.fasttrackit.tema12.Days;

public class MainEnum {

    public static void main(String[] args) {

        DaySchedule firstDay = new DaySchedule(DaysOfWeek.LUNI, "Lucram");
        DaySchedule secondDay = new DaySchedule(DaysOfWeek.MARTI, "Dam la sapa");
        DaySchedule thirdDay = new DaySchedule(DaysOfWeek.MIERCURI, "Facem sala");
        DaySchedule fourthDay = new DaySchedule(DaysOfWeek.JOI, "Plantam cartofi");
        DaySchedule fifthDay = new DaySchedule(DaysOfWeek.VINERI, "Gatim");
        DaySchedule sixthDay = new DaySchedule(DaysOfWeek.SAMBATA, "Mergem la bal");
        DaySchedule seventhDay = new DaySchedule(DaysOfWeek.DUMINICA, "La biserica");

        System.out.println("George " + firstDay.getDays() + " " + firstDay.getActivity());
        System.out.println(sixthDay.getDays() + " " + sixthDay.getActivity());
    }
}
