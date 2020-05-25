package by.gsu.pms;

import java.util.Comparator;

public class SortedByName implements Comparator<Purchase> {

    @Override
    public int compare(Purchase obj1, Purchase obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();
        return str1.compareTo(str2);
    }
}
