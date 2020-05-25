package by.gsu.pms.beans.groups;

import by.gsu.pms.beans.Byn;
import by.gsu.pms.beans.toys.Balls;
import by.gsu.pms.beans.toys.BigCars;
import by.gsu.pms.beans.toys.Cubes;
import by.gsu.pms.beans.toys.Dolls;
import by.gsu.pms.interfaces.Playroom;

public class Kindergartners implements Playroom {
    public static final Byn BUDGET = new Byn(150000);
    private Balls balls;
    private BigCars bigCars;
    private Cubes cubes;
    private Dolls dolls;

    public Kindergartners() {
    }

    public Kindergartners(Balls balls, BigCars bigCars, Cubes cubes, Dolls dolls) {
        this.balls = balls;
        this.bigCars = bigCars;
        this.cubes = cubes;
        this.dolls = dolls;
    }

    public Balls getBalls() {
        return balls;
    }

    public void setBalls(Balls balls) {
        this.balls = balls;
    }

    public BigCars getBigCars() {
        return bigCars;
    }

    public void setBigCars(BigCars bigCars) {
        this.bigCars = bigCars;
    }

    public Cubes getCubes() {
        return cubes;
    }

    public void setCubes(Cubes cubes) {
        this.cubes = cubes;
    }

    public Dolls getDolls() {
        return dolls;
    }

    public void setDolls(Dolls dolls) {
        this.dolls = dolls;
    }

    @Override
    public int getTotalNumberToys() {
        return balls.getNumber() + bigCars.getNumber() + cubes.getNumber() + dolls.getNumber();
    }

    @Override
    public void goForAWalk() {
        System.out.println("Kindergartners children go for a walk");
    }

    @Override
    public void feedChildren() {
        System.out.println("Kindergartners children feeding");
    }

    @Override
    public void giveChildren() {
        System.out.println("Give kindergartners children to parents");
    }

    @Override
    public String toString() {
        return balls + ";" + bigCars + ";" + cubes + ";" + dolls + ";" + getTotalNumberToys() + ";" + BUDGET;
    }
}
