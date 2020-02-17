package by.gsu.pms;

public class Employee {
    private final static int RATE = 25000;
    private String account;
    private int transport;
    private int days;

    public Employee(String account, int transport, int days) {
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public Employee() {
    }

    public int getRate() {
        return RATE;
    }

    public String getAccount() {
        return account;
    }

    public int getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotal() {
        int total = 0;
        if (days > 1)
            total = RATE * days + transport;
        else if (days == 1)
            total = transport;
        return total;
    }

    public void show() {
        System.out.println("rate = " + RATE);
        System.out.println("account = " + account);
        System.out.println("transport = " + transport);
        System.out.println("days = " + days);
        System.out.println("total = " + getTotal());
    }

    @Override
    public String toString() {
        return RATE + ";" + account + ";" + transport + ";" + days + ";" + getTotal();
    }
}
