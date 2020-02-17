package by.gsu.pms;

public class Runner {

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

    public static void main(String[] args) {
        Employee[] employee = new Employee[7];
        employee[0] = new Employee( "Siroga Krasiviy", 100000, 4);
        employee[1] = new Employee( "Yarik Starik", 60000, 7);
        employee[3] = new Employee( "Romka Kovbasa", 30000, 21);
        employee[4] = new Employee( "Drozdik Pashkevich", 75000, 3);
        employee[5] = new Employee( "Yarik Starik", 60000, 7);
        employee[6] = new Employee();

        for (Employee item : employee) {
            if (item != null) item.show();
        }

        employee[6].setTransport(30000);

        System.out.println("Duration = " + initialTrips(employee));

        for (Employee item : employee) {
            System.out.println(item);
        }

        System.out.println(totalExpenses(employee));
        System.out.println(maximumTotal(employee));

    }
}
