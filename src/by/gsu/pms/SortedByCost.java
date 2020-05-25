package by.gsu.pms;

import java.math.BigDecimal;
import java.util.Comparator;

public class SortedByCost implements Comparator<Purchase> {

    @Override
    public int compare(Purchase obj1, Purchase obj2) {
        BigDecimal cost1 = obj1.getCost();
        BigDecimal cost2 = obj2.getCost();
        if (cost1.equals(cost1.max(cost2)))
            return 1;
        else if (cost2.equals(cost1.max(cost2)))
        return -1;
        else return 0;
    }
}
