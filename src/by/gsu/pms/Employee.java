package by.gsu.pms;

import java.math.BigDecimal;

public class Employee {
    private final static Converter RATE = new Converter(250, 2.21, 2);
    private String account;
    private Converter transport;
    private int days;

    public Employee(String account, double beforeConvert, double divider, int numberPlaces, int days) {
        this.account = account;
        this.transport = new Converter(beforeConvert, divider, numberPlaces);
        this.days = days;
    }

    public Employee() {
    }

    public BigDecimal getRate() {
        return RATE.getCurrency();
    }

    public String getAccount() {
        return account;
    }

    public BigDecimal getTransport() {
        return transport.getCurrency();
    }

    public int getDays() {
        return days;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setTransport(double beforeConvert, double divider, int numberPlaces) {
        this.transport = new Converter(beforeConvert, divider, numberPlaces);
    }

    public void setDays(int days) {
        this.days = days;
    }

    public BigDecimal getTotal() {
        BigDecimal total =  new BigDecimal("0");
        if (days > 1)
            total = RATE.getCurrency().multiply(BigDecimal.valueOf(days)).add(transport.getCurrency());
        else if (days == 1)
            total = transport.getCurrency();
        return total;
    }

    public void show() {
        if (transport != null) {
            System.out.println("rate = " + RATE.getCurrency());
            System.out.println("account = " + account);
            System.out.println("transport = " + transport.getCurrency());
            System.out.println("days = " + days);
            System.out.println("total = " + getTotal());
        }
    }

    @Override
    public String toString() {
        return RATE.getCurrency() + ";" + account + ";" + transport.getCurrency() + ";" + days + ";" + getTotal();
    }
}
