package by.gsu.pms;

import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase {
    private double discount;
    private static final int LIMIT = 5;

    public PercentDiscountPurchase() {
    }

    public PercentDiscountPurchase(String name, Byn price, int numberUnits, double discount) {
        super(name, price, numberUnits);
        this.discount = discount;
    }

    public PercentDiscountPurchase(Scanner sc) {
        super(sc);
        this.discount = sc.nextDouble();
    }

    public Byn getCost() {
        Byn cost = super.getCost();
        Byn percent100 = new Byn(100);
        if (getUnitsNumber() > LIMIT) {
            cost.mul(((100 - discount) / 100), Byn.RoundMethod.CEILING, 0);
        }
        return cost;
    }

    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}

