package ro.fasttrackit.curs12.homework.ex4;

import java.util.EnumMap;

public class DaySchedule {
    public static void main(String[] args) {
        EnumMap<WeekDays, String> daysActivities = new EnumMap<>(WeekDays.class) {
            {
                put(WeekDays.MONDAY, " Limbi Straine");
                put(WeekDays.TUESDAY, " Sport in aer liber");
                put(WeekDays.WEDNESDAY, " Lectura");
                put(WeekDays.THURSDAY, " Sport in sala");
                put(WeekDays.FRIDAY, " Activitati caritabile");
                put(WeekDays.SATURDAY, " Munte");
                put(WeekDays.SUNDAY, " Inot");
            }
        };
        System.out.println(daysActivities);
    }
}
