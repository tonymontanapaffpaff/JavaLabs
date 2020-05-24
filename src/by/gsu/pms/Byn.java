package by.gsu.pms;

public class Byn implements Comparable<Byn> {
    private int value;

    public Byn() {
    }

    public Byn(int value) {
        this.value = value;
    }

    public Byn(int rubs, int coins) {
        this(rubs + 100 * coins);
    }

    public Byn(Byn byn) {
        this(byn.value);
    }

    public int getRubs() {
        return value / 100;
    }

    public int getCoins() {
        return value % 100;
    }

    public Byn add(Byn byn) {
        value += byn.value;
        return this;
    }

    public Byn sub(Byn byn) {
        value -= byn.value;
        return this;
    }

    public Byn mul(int k) {
        value *=k;
        return this;
    }

    public enum RoundMethod {
        FLOOR {
            double roundFunction(double d) {
                return Math.floor(d);
            }
        }, CEILING {
            double roundFunction(double d) {
                return Math.ceil(d);
            }
        };

        private int pow10 (int d) {
            int dInPow10 = 1;
            if (d > 0)
                dInPow10 = 10 * d;
            return dInPow10;
        }

        abstract double roundFunction(double value);

        private int round(double roundedValue, RoundMethod roundMethod, int d) {
            int tenPow = (int) roundMethod.pow10(d);
            int result = (int) roundMethod.roundFunction(roundedValue / tenPow) * tenPow;
            return result;
        }
    }

    public Byn mul(double k, RoundMethod roundMethod, int d){
        value = roundMethod.round(value * k, roundMethod, d);
        return this;
    }

    public Byn round(RoundMethod roundMethod, int d){
        value = roundMethod.round(value, roundMethod, d);
        return this;
    }


    @Override
    public String toString() {
        return value / 100 + "." + value % 100 / 10 + value % 10 % 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Byn byn = (Byn) obj;
        return value == byn.value;
    }

    @Override
    public int compareTo(Byn byn) {
        return Integer.compare(this.value, byn.value);
    }
}
