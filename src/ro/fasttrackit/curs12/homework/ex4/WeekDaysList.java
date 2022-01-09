package ro.fasttrackit.curs12.homework.ex4;

import java.util.ArrayList;
import java.util.List;

public class WeekDaysList {

    private final List<WeekDaysActivities> weekDaysActivities;

    public WeekDaysList(List<WeekDaysActivities> weekDaysActivities){
        this.weekDaysActivities = weekDaysActivities == null
                ? new ArrayList<>()
                : new ArrayList<>(weekDaysActivities);
    }

    public List<WeekDaysActivities> getWeekDaysActivities(WeekDays weekDays){
        List<WeekDaysActivities> result = new ArrayList<>();
        for(WeekDaysActivities weekDayAct : weekDaysActivities){
            if(weekDayAct.getWeekDays() == weekDays){
                result.add(weekDayAct);
            }
        }
        return result;
    }
}
