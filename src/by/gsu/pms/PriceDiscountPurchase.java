package by.gsu.pms;

public class PriceDiscountPurchase extends AbstractPurchase {
    private final Byn discount;

    public PriceDiscountPurchase(Commodity commodity, int numberUnits, Byn discount) {
        super(commodity, numberUnits);
        this.discount = discount;
    }

    @Override
    protected Byn getFinalCost(Byn baseCost) {
        return baseCost.sub(discount.mul(getUnitsNumber()));
    }

    @Override
    public String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}
