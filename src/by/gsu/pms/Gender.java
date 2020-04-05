package by.gsu.pms;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
