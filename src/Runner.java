import by.gsu.pms.*;

import java.util.Arrays;

public class Runner {

    private static void printArray(AbstractPurchase[] purchases) {
        for (AbstractPurchase item : purchases)
            System.out.println(item);
    }

    public static void main(String[] args) {
        final Commodity commodity = new Commodity("Guitar", new Byn(56230));
        AbstractPurchase[] purchases = {
                new PriceDiscountPurchase(commodity, 5, new Byn(7520)),
                new PriceDiscountPurchase(commodity, 1, new Byn(55730)),
                new PercentDiscountPurchase(commodity, 8, 20.5),
                new PercentDiscountPurchase(commodity, 2, 7),
                new TransportExpencesPurchase(commodity, 4, new Byn(2500)),
                new TransportExpencesPurchase(commodity, 3, new Byn(5500))
        };

        printArray(purchases);

        Arrays.sort(purchases);

        System.out.println("After sorting: ");
        printArray(purchases);

        System.out.println("Minimum cost = " + purchases[purchases.length - 1]);
    }
}
