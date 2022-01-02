package ro.fasttrackit.curs12.homework.ex4;

public enum WeekDays {
    MONDAY("1"),
    TUESDAY("2"),
    WEDNESDAY("3"),
    THURSDAY("4"),
    FRIDAY("5"),
    SATURDAY("6"),
    SUNDAY("7");

    private final String ziua;

    WeekDays(String ziua) {
        this.ziua = ziua;
    }

    public String getZiua() {
        return ziua;
    }
}
