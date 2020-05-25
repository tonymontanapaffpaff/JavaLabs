package by.gsu.pms.beans.groups;

import by.gsu.pms.beans.Byn;
import by.gsu.pms.beans.toys.Cars;
import by.gsu.pms.beans.toys.Cubes;
import by.gsu.pms.beans.toys.Dolls;
import by.gsu.pms.interfaces.Playroom;

public class Nursery implements Playroom {
    public static final Byn BUDGET = new Byn(150000);
    private Cars cars;
    private Dolls dolls;
    private Cubes cubes;

    public Nursery() {
    }

    public Nursery(Cars cars, Dolls dolls, Cubes cubes) {
        this.cars = cars;
        this.dolls = dolls;
        this.cubes = cubes;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Dolls getDolls() {
        return dolls;
    }

    public void setDolls(Dolls dolls) {
        this.dolls = dolls;
    }

    public Cubes getCubes() {
        return cubes;
    }

    public void setCubes(Cubes cubes) {
        this.cubes = cubes;
    }

    @Override
    public void goForAWalk() {
        System.out.println("Nursery children go for a walk");
    }

    @Override
    public void feedChildren() {
        System.out.println("Nursery children feeding");
    }

    @Override
    public void giveChildren() {
        System.out.println("Give nursery children to parents");
    }

    @Override
    public int getTotalNumberToys() {
        return cars.getNumber() + dolls.getNumber() + cubes.getNumber();
    }

    @Override
    public String toString() {
        return cars + ";" + dolls + ";" + cubes + ";" + getTotalNumberToys() + ";" + BUDGET;
    }
}
