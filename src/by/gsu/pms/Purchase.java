package by.gsu.pms;

import java.util.Objects;
import java.util.Scanner;

public class Purchase {
    private String name;
    private Byn price;
    private int unitsNumber;

    public Purchase() {
    }

    public Purchase(String name, Byn price, int numberUnits) {
        this.name = name;
        this.price = price;
        this.unitsNumber = numberUnits;
    }

    public Purchase(Scanner sc) {
        this.name = sc.next();
        this.price = new Byn(sc.nextInt());
        this.unitsNumber = sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public Byn getPrice() {
        return price;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Byn price) {
        this.price = price;
    }

    public void setUnitsNumber(int unitsNumber) {
        this.unitsNumber = unitsNumber;
    }

    public Byn getCost() {
        Byn total = new Byn(price);
        return total.mul(unitsNumber);
    }

    protected String fieldsToString() {
        return name + ";" + price + ";" + unitsNumber;
    }

    @Override
    public String toString() {
        return fieldsToString() + ";" + getCost();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Purchase)) return false;
        Purchase purchase = (Purchase) obj;
        return Objects.equals(name, purchase.name)
                && price.equals(purchase.price);
    }
}
