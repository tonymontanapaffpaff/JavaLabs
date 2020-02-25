import by.gsu.pms.SortedByCost;
import by.gsu.pms.SortedByName;
import by.gsu.pms.WeekDay;
import by.gsu.pms.Purchase;

import java.math.BigDecimal;
import java.util.Arrays;

public class Runner {

    private static WeekDay maxCostDay(Purchase[] purchase) {
        Purchase maxCost = purchase[0];
        for (Purchase item : purchase)
            if (item != null)
                if (item.getTotal().equals(item.getTotal().max(maxCost.getTotal()))) maxCost = item;
        return maxCost.getDay();
    }

    private static BigDecimal mondayCost(Purchase[] purchase) {
        BigDecimal cost = new BigDecimal(0);
        for (Purchase item : purchase)
            if (item != null)
                if (item.getDay() == WeekDay.MONDAY)
                    cost = cost.add(item.getTotal());
        return cost;
    }

    private static BigDecimal averageCost(Purchase[] purchase) {
        BigDecimal cost = new BigDecimal(0);
        for (Purchase item : purchase)
            if (item != null)
                cost = cost.add(item.getTotal());
        return cost.divide(BigDecimal.valueOf(purchase.length));
    }

    public static void main(String[] args) {
        Purchase[] purchase = new Purchase[7];
        purchase[0] = new Purchase(2.52, "Banana", WeekDay.MONDAY, 10);
        purchase[1] = new Purchase(1.566, "Apple", WeekDay.FRIDAY, 20);
        purchase[2] = new Purchase();
        purchase[3] = new Purchase(4.23, "Pineapple", WeekDay.TUESDAY, 5);
        purchase[4] = new Purchase(2.366, "Orange", WeekDay.WEDNESDAY, 15);
        purchase[5] = new Purchase(5.28, "Mango", WeekDay.SATURDAY, 8);
        purchase[6] = new Purchase(1.899, "Kiwi", WeekDay.MONDAY, 7);

        for (Purchase item : purchase)
            if (item != null) item.show();

        purchase[2].setCost(3.25);

        for (Purchase item : purchase)
            System.out.println(item);

        System.out.println(maxCostDay(purchase));
        System.out.println(mondayCost(purchase));
        System.out.println(averageCost(purchase));

        Arrays.sort(purchase);
        System.out.println("Sorted by count:");
        for (Purchase item : purchase)
            System.out.println(item);

        Arrays.sort(purchase, new  SortedByCost());
        System.out.println("Sorted by cost:");
        for (Purchase item : purchase)
            System.out.println(item);

        Arrays.sort(purchase, new SortedByName());
        System.out.println("Sorted by name:");
        for (Purchase item : purchase)
            System.out.println(item);
    }
}
