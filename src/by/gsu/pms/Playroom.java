package by.gsu.pms;

import java.math.BigDecimal;

public class Playroom {
    private BigDecimal budget;
    private int cars;
    private int dolls;
    private int balls;
    private int cubes;

    public Playroom() {
    }

    public Playroom(BigDecimal budget) {
        this.budget = budget;
    }

    public Playroom(BigDecimal budget, int cars, int dolls, int balls, int cubes) {
        this.budget = budget;
        this.cars = cars;
        this.dolls = dolls;
        this.balls = balls;
        this.cubes = cubes;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public int getCars() {
        return cars;
    }

    public int getDolls() {
        return dolls;
    }

    public int getBalls() {
        return balls;
    }

    public int getCubes() {
        return cubes;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public void setDolls(int dolls) {
        this.dolls = dolls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setCubes(int cubes) {
        this.cubes = cubes;
    }

    @Override
    public String toString() {
        return budget + ";" + cars + ";" + dolls + ";" + balls + ";" + cubes;
    }
}
