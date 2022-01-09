package ro.fasttrackit.curs12.homework.ex4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
            WeekDaysList weekDaysList = new WeekDaysList(List.of(
                    new WeekDaysActivities(WeekDays.MONDAY,"Activitati culturale"),
                    new WeekDaysActivities(WeekDays.TUESDAY,"Sport"),
                    new WeekDaysActivities(WeekDays.WEDNESDAY,"Iesire cu prietenii"),
                    new WeekDaysActivities(WeekDays.THURSDAY,"Lectura"),
                    new WeekDaysActivities(WeekDays.FRIDAY,"Muzica"),
                    new WeekDaysActivities(WeekDays.SATURDAY,"Munte"),
                    new WeekDaysActivities(WeekDays.SUNDAY," Activitati cu familia")
            ));

        System.out.println(weekDaysList.getWeekDaysActivities(WeekDays.MONDAY));
        System.out.println(weekDaysList.getWeekDaysActivities(WeekDays.SATURDAY));
        System.out.println(weekDaysList.getWeekDaysActivities(WeekDays.SUNDAY));
    }
}
