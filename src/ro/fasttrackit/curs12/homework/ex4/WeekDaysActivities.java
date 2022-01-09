package ro.fasttrackit.curs12.homework.ex4;

import java.util.Objects;

public class WeekDaysActivities{

    private final WeekDays weekDays;
    private final String ziua;

    WeekDaysActivities(WeekDays weekDays, String ziua){
        this.weekDays = weekDays;
        this.ziua = ziua;
    }

    public String getZiua() {
        return ziua;
    }

    public WeekDays getWeekDays() {
        return weekDays;
    }

    @Override
    public String toString() {
        return "WeekDaysActivities{" +
                "weekDays=" + weekDays +
                ", ziua='" + ziua + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeekDaysActivities that = (WeekDaysActivities) o;
        return weekDays == that.weekDays && Objects.equals(ziua, that.ziua);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weekDays, ziua);
    }
}
