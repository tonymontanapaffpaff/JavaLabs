import by.gsu.pms.Byn;
import by.gsu.pms.Purchase;
import by.gsu.pms.PurchasesFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("src/in.txt"));
            sc.useLocale(Locale.ENGLISH);

            final int PURCHASES_NUMBER = 6;
            Purchase[] purchases = new Purchase[PURCHASES_NUMBER];

            Purchase maxCost = new Purchase("maxCost", new Byn(0), 0);
            boolean areEqual = true;

            for (int i = 0; i < purchases.length; i++) {
                purchases[i] = PurchasesFactory.getPurchaseFromFactory(sc);
                if (purchases[i].getCost().compareTo(maxCost.getCost()) > 0) maxCost = purchases[i];
                if (areEqual) {
                    areEqual = purchases[i].equals(purchases[0]);
                }
                System.out.println(purchases[i]);
            }

            System.out.println("Purchase with maximum cost = " + maxCost);
            if (areEqual)
                System.out.println("All purchases are equal");

        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found!!!!");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}