package by.gsu.pms;

import java.math.BigDecimal;

public class Nursery extends Playroom {

    private int BigCars;

    public Nursery() {
    }

    public Nursery(BigDecimal budget) {
        super(budget);
    }

    public Nursery(BigDecimal budget, int cars, int dolls, int balls, int cubes) {
        super(budget, cars, dolls, balls, cubes);
    }
}
