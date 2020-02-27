import by.gsu.pms.Gender;
import by.gsu.pms.Person;
import by.gsu.pms.SortedBySurname;

import java.util.Arrays;

public class Runner {

    private static double averageAge(Person[] person) {
        double result = 0;
        for (Person item : person)
            result += item.getAge();
        return result / person.length;
    }

    private static int numberOfMen(Person[] person) {
        int result = 0;
        for (Person item : person)
            if (item.getGender().equals(Gender.MALE)) result++;
        return result;
    }

    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0] = new Person("Zabuzko", 16, Gender.MALE);
        person[1] = new Person("Hishnyak", 25, Gender.MALE);
        person[2] = new Person("Butler", 42, Gender.FEMALE);
        person[3] = new Person("Susarenko", 31, Gender.MALE);
        person[4] = new Person("Kovalev", 23, Gender.MALE);
        person[5] = new Person("Bell", 20, Gender.FEMALE);
        person[6] = new Person("Nedbaylo", 17, Gender.MALE);
        person[7] = new Person("Bryant", 26, Gender.FEMALE);
        person[8] = new Person("Torres", 22, Gender.FEMALE);
        person[9] = new Person("Lewis", 17, Gender.FEMALE);

        for (Person item : person)
            item.show();

        System.out.println();
        for (Person item : person)
            System.out.println(item);

        System.out.println();
        System.out.println("Average age = " + averageAge(person));
        System.out.println("Number of men = " + numberOfMen(person));

        Arrays.sort(person);

        System.out.println();
        System.out.println("Sorted by age:");
        for (Person item : person)
            System.out.println(item);

        Arrays.sort(person, new SortedBySurname());

        System.out.println();
        System.out.println("Sorted by surname:");
        for (Person item : person)
            System.out.println(item);
    }
}
