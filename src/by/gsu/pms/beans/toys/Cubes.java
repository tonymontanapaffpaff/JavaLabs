package by.gsu.pms.beans.toys;

import by.gsu.pms.constants.Consts;

public class Cubes {
    private int number;
    private String color;

    public Cubes() {
    }

    public Cubes(String line) {
        String[] cubes = line.split(Consts.SPLIT_INNER);
        this.number = Integer.parseInt(cubes[0]);
        this.color = cubes[1];
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
