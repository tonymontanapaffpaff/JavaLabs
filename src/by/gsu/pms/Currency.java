package by.gsu.pms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Currency {

    private double beforeConvert;

    public Currency(double beforeConvert) {
        this.beforeConvert = beforeConvert;
    }

    public Currency() {
    }

    public BigDecimal getCurrency() {
        BigDecimal result = new BigDecimal(beforeConvert);
        return result.setScale(2, RoundingMode.HALF_UP);
    }
}
