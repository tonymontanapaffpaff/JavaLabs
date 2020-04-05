import by.gsu.pms.Deserialization;
import by.gsu.pms.Gender;
import by.gsu.pms.Person;
import by.gsu.pms.Serialization;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    private static void print(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        final String INPUT = "src/in.txt";
        final int PERSONS_NUMBER = 10;
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(INPUT));
            sc.useLocale(Locale.ENGLISH);
            Person[] people = new Person[PERSONS_NUMBER];
            double totalAge = 0;
            int maleNumber = 0;

            for (int i = 0; i < people.length; i++) {
                String surname = sc.next();
                int age = sc.nextInt();
                int sex = sc.nextInt();
                people[i] = new Person(surname, age, sex);
            }

            print(people);

            Serialization serialization = new Serialization();
            serialization.serialization(people);

            Person[] newPeople;
            Deserialization deserialization = new Deserialization();
            newPeople = deserialization.deserialization();

            System.out.println();
            System.out.println("After serialization:");
            print(newPeople);

            for (Person person : newPeople) {
                totalAge += person.getAge();
                if (person.getSex() == Gender.MALE) {
                    maleNumber++;
                }
            }

            System.out.println();
            System.out.println("The average age is " + totalAge / PERSONS_NUMBER);
            System.out.println("The number of men is " + maleNumber);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("File doesn't exist");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
