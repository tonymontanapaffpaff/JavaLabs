package by.gsu.pms;

import java.math.BigDecimal;

public class Purchase implements Comparable<Purchase> {
    private Currency cost;
    private String name;
    private WeekDay day;
    private int count;

    public Purchase(double cost, String name, WeekDay day, int count) {
        this.cost = new Currency(cost);
        this.name = name;
        this.day = day;
        this.count = count;
    }

    public Purchase() {
    }

    public BigDecimal getCost() {
        return cost.getCurrency();
    }

    public String getName() {
        return name;
    }

    public WeekDay getDay() {
        return day;
    }

    public int getCount() {
        return count;
    }

    public void setCost(double cost) {
        this.cost = new Currency(cost);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(WeekDay day) {
        this.day = day;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getTotal() {
        return cost.getCurrency().multiply(BigDecimal.valueOf(count));
    }

    public void show() {
        if (cost != null) {
            System.out.println("cost = " + cost.getCurrency());
            System.out.println("name = " + name);
            System.out.println("day = " + day);
            System.out.println("count = " + count);
            System.out.println("total = " + getTotal());
        }
    }

    @Override
    public String toString() {
        return cost.getCurrency() + ";" + name + ";" + day + ";" + count + ";" + getTotal();
    }

    @Override
    public int compareTo(Purchase purchase) {
        return Integer.compare(this.count, purchase.count);
    }
}
