package by.gsu.pms;

public class TransportExpencesPurchase extends AbstractPurchase {
    private final Byn transport;

    public TransportExpencesPurchase(Commodity commodity, int numberUnits, Byn transport) {
        super(commodity, numberUnits);
        this.transport = transport;
    }

    @Override
    protected Byn getFinalCost(Byn baseCost) {
        return baseCost.add(transport);
    }

    @Override
    public String fieldsToString() {
        return super.fieldsToString() + ";" + transport;
    }
}
