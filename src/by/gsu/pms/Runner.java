package by.gsu.pms;

public class Runner {

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

        System.out.println("Duration = " + Employee.initialTrips(employee));

        for (Employee item : employee) {
            System.out.println(item);
        }

        System.out.println(Employee.totalExpenses(employee));
        System.out.println(Employee.maximumTotal(employee));

    }
}
