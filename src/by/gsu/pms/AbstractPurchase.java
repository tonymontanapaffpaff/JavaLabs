package by.gsu.pms;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {
    private final Commodity commodity;
    private int unitsNumber;

    public AbstractPurchase(Commodity commodity, int numberUnits) {
        this.commodity = commodity;
        this.unitsNumber = numberUnits;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public void setUnitsNumber(int unitsNumber) {
        this.unitsNumber = unitsNumber;
    }

    protected abstract Byn getFinalCost(Byn baseCost);

    public Byn getCost() {
        Byn baseCost = commodity.getPrice().mul(unitsNumber);
        Byn finalCost = getFinalCost(baseCost);
        return finalCost.round(Byn.RoundMethod.FLOOR, 2);
    }

    public String fieldsToString() {
        return commodity + ";" + unitsNumber;
    }

    @Override
    public String toString() {
        return fieldsToString() + ";" + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return purchase.getCost().compareTo(this.getCost());
    }
}
