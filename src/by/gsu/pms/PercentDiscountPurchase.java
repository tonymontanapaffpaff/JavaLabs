package by.gsu.pms;

public class PercentDiscountPurchase extends AbstractPurchase {
    private final double discount;
    private static final int LIMIT = 7;

    public PercentDiscountPurchase(Commodity commodity, int numberUnits, double discount) {
        super(commodity, numberUnits);
        this.discount = discount;
    }

    @Override
    protected Byn getFinalCost(Byn baseCost) {
        if (getUnitsNumber() > LIMIT)
            baseCost = baseCost.mul(((100 - discount) / 100), Byn.RoundMethod.FLOOR, 2);
        return baseCost;
    }

    @Override
    public String fieldsToString() {
        return super.fieldsToString()  + ";" + discount;
    }
}
