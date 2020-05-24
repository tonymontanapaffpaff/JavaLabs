package by.gsu.pms.beans.toys;

import by.gsu.pms.constants.Consts;

public class Balls {
    private int number;

    public Balls() {
    }

    public Balls(String line) {
        String[] balls = line.split(Consts.SPLIT_INNER);
        this.number = Integer.parseInt(balls[0]);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "";
    }
}
