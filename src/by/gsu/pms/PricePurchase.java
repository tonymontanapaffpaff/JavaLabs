package by.gsu.pms;

import java.util.Scanner;

public class PricePurchase extends Purchase {
    private Byn discount;

    public PricePurchase() {
    }

    public PricePurchase(String name, Byn price, int numberUnits, Byn discount) {
        super(name, price, numberUnits);
        this.discount = discount;
    }

    public PricePurchase(Scanner sc) {
        super(sc);
        this.discount = new Byn(sc.nextInt());
    }

    public Byn getDiscount() {
        return discount;
    }

    public void setDiscount(Byn discount) {
        this.discount = discount;
    }

    public Byn getCost() {
        Byn total = new Byn(getPrice());
        return total.sub(discount).mul(getUnitsNumber());
    }

    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}
