import by.gsu.pms.Byn;
import by.gsu.pms.PricePurchase;
import by.gsu.pms.Purchase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Runner {

    private static void printCollection(List<Purchase> list) {
        for (Purchase purchase : list) {
            System.out.println(purchase);
        }
    }

    public static void main(String[] args) {
        final String INPUT = "src/in.csv";
        final String SPLIT_LINE = ";";
        final int PURCHASE_LENGTH = Purchase.class.getDeclaredFields().length;
        final int PRICE_PURCHASE_LENGTH = PURCHASE_LENGTH + PricePurchase.class.getDeclaredFields().length;
        final int INDEX_REQUIRED_ELEMENT = 6;
        final Byn MIN_PRICE = new Byn(10000);
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(INPUT));
            List<Purchase> list = new ArrayList<>();

            //paragraph 1
            while (sc.hasNext()) {
                String[] line = sc.nextLine().split(SPLIT_LINE);
                if (line.length == PURCHASE_LENGTH) {
                    list.add(new Purchase(line[0], new Byn(Integer.parseInt(line[1])), Integer.parseInt(line[2])));
                } else if (line.length == PRICE_PURCHASE_LENGTH) {
                    list.add(new PricePurchase(line[0], new Byn(Integer.parseInt(line[1])), Integer.parseInt(line[2]), new Byn(Integer.parseInt(line[3]))));
                }
            }

            //paragraph 2
            System.out.println("Before sorting: ");
            printCollection(list);

            //paragraph 3
            System.out.println("Purchase with the index 6: ");
            System.out.println(list.get(INDEX_REQUIRED_ELEMENT));

            //paragraph 4
            Iterator<Purchase> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getPrice().compareTo(MIN_PRICE) < 0) {
                    iterator.remove();
                }
            }

            //paragraph 5
            System.out.println("After sorting: ");
            Collections.sort(list);

            //paragraph 6
            printCollection(list);

            //paragraph 7
            Purchase requiredPurchase = new Purchase("butter", new Byn(35000), 1);
            int indexRequiredPurchase = Collections.binarySearch(list, requiredPurchase);

            if (indexRequiredPurchase >= 0) {
                System.out.println("Required element is " + list.get(indexRequiredPurchase));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file doesn't exist");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
