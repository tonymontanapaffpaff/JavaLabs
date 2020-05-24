package by.gsu.pms.beans;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
