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

    public static int initialTrips(Employee[] employee) {
        int duration = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[j] != null) {
                    if (employee[i].toString().equals(employee[j].toString())) duration = employee[i].getDays();
                }
            }
            }
        }
        return duration;
    }

    public static int totalExpenses(Employee[] employee) {
        int total = 0;
        for (Employee item : employee) {
            if (item != null)
                total += item.getTotal();
        }
        return total;
    }

    public static String maximumTotal(Employee[] employee) {
        Employee maximum = employee[0];
        for (Employee item : employee) {
            if (item != null)
                if (item.getTotal() > maximum.getTotal()) maximum = item;
        }
        return maximum.getAccount();
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
