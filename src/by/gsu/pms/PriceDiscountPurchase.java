package by.gsu.pms;

import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase {
    private Byn discount;

    public PriceDiscountPurchase() {
    }

    public PriceDiscountPurchase(String name, Byn price, int numberUnits, Byn discount) {
        super(name, price, numberUnits);
        this.discount = discount;
    }

    public PriceDiscountPurchase(Scanner sc) {
        super(sc);
        this.discount = new Byn(sc.nextInt());
    }

    public Byn getCost() {
        Byn total = new Byn(getPrice());
        return total.sub(discount).mul(getUnitsNumber());
    }

    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}
