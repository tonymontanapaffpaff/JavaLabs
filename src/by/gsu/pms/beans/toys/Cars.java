package by.gsu.pms.beans.toys;

import by.gsu.pms.constants.Consts;

public class Cars {
    private int number;
    private String color;

    public Cars() {
    }

    public Cars(String line) {
        String[] cars = line.split(Consts.SPLIT_INNER);
        this.number = Integer.parseInt(cars[0]);
        this.color = cars[1];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return number + "," + color;
    }
}
