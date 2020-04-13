package by.gsu.pms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {

    private double beforeConvert;
    private double divider;
    private int numberPlaces;

    public Converter(double beforeConvert, double divider, int numberPlaces) {
        this.beforeConvert = beforeConvert;
        this.divider = divider;
        this.numberPlaces = numberPlaces;
    }

    public Converter() {
    }

    public BigDecimal getCurrency() {
        BigDecimal result = new BigDecimal(beforeConvert);
        return result.divide(BigDecimal.valueOf(divider), numberPlaces, RoundingMode.HALF_UP);
    }
}
