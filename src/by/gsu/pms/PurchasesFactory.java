package by.gsu.pms;

import java.util.Scanner;

public class PurchasesFactory {
    private enum PurchaseKind {
        GENERAL_PURCHASE {
            @Override
            Purchase getPurchase(Scanner sc) {
                return new Purchase(sc);
            }
        }, PRICE_DISCOUNT_PURCHASE {
            @Override
            Purchase getPurchase(Scanner sc) {
                return new PriceDiscountPurchase(sc);
            }
        }, PERCENT_DISCOUNT_PURCHASE {
            @Override
            Purchase getPurchase(Scanner sc) {
                return new PercentDiscountPurchase(sc);
            }
        };

        abstract Purchase getPurchase(Scanner sc);
    }

    public static Purchase getPurchaseFromFactory(Scanner sc) {
        PurchaseKind kind = PurchaseKind.valueOf(sc.next());
        return kind.getPurchase(sc);
    }
}
