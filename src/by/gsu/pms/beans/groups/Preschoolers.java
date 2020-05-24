package by.gsu.pms.beans.groups;

import by.gsu.pms.beans.Byn;
import by.gsu.pms.beans.toys.BigCars;
import by.gsu.pms.beans.toys.Cars;
import by.gsu.pms.beans.toys.Dolls;
import by.gsu.pms.beans.toys.SmallCars;
import by.gsu.pms.interfaces.Playroom;

public class Preschoolers implements Playroom {
    public static final Byn BUDGET = new Byn(150000);
    private Cars cars;
    private SmallCars smallCars;
    private BigCars bigCars;
    private Dolls dolls;

    public Preschoolers() {
    }

    public Preschoolers(Cars cars, SmallCars smallCars, BigCars bigCars, Dolls dolls) {
        this.cars = cars;
        this.smallCars = smallCars;
        this.bigCars = bigCars;
        this.dolls = dolls;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public SmallCars getSmallCars() {
        return smallCars;
    }

    public void setSmallCars(SmallCars smallCars) {
        this.smallCars = smallCars;
    }

    public BigCars getBigCars() {
        return bigCars;
    }

    public void setBigCars(BigCars bigCars) {
        this.bigCars = bigCars;
    }

    public Dolls getDolls() {
        return dolls;
    }

    public void setDolls(Dolls dolls) {
        this.dolls = dolls;
    }

    @Override
    public int getTotalNumberToys() {
        return cars.getNumber() + smallCars.getNumber() + bigCars.getNumber() + dolls.getNumber();
    }

    @Override
    public void goForAWalk() {
        System.out.println("Preschoolers children go for a walk");
    }

    @Override
    public void feedChildren() {
        System.out.println("Preschoolers children feeding");
    }

    @Override
    public void giveChildren() {
        System.out.println("Give preschoolers children to parents");
    }

    @Override
    public String toString() {
        return cars + ";" + smallCars + ";" + bigCars + ";" + dolls + ";" + getTotalNumberToys() + ";" + BUDGET;
    }
}
