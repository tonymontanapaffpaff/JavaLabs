package by.gsu.pms;

import java.util.Comparator;

public class SortedBySurname implements Comparator<Person> {
    @Override
    public int compare(Person obj1, Person obj2) {
        String str1 = obj1.getSurname();
        String str2 = obj2.getSurname();
        return str1.compareTo(str2);
    }
}
