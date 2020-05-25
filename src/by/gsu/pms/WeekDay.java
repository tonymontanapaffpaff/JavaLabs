package by.gsu.pms;

public enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
