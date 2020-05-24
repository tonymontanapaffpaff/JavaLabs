package by.gsu.pms.beans.toys;

import by.gsu.pms.constants.Consts;

public class SmallCars extends Cars {
    private String model;

    public SmallCars() {
    }

    public SmallCars(String line) {
        String[] smallCars = line.split(Consts.SPLIT_INNER);
        super.setNumber(Integer.parseInt(smallCars[0]));
        super.setColor(smallCars[1]);
        this.model = smallCars[2];
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "," + model;
    }
}
