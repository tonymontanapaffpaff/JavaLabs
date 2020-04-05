package by.gsu.pms;

public class Byn implements Comparable<Byn> {
    private final int value;

    public Byn(int value) {
        this.value = value;
    }

    public int getRubs() {
        return value / 100;
    }

    public int getCoins() {
        return value - getRubs() * 100;
    }

    public Byn add(Byn byn) {
        return new Byn(value + byn.value);
    }

    public Byn sub(Byn byn) {
        return new Byn(value - byn.value);
    }

    public Byn mul(Byn byn) {
        return new Byn(value * byn.value);
    }

    public Byn mul(int k) {
        return new Byn(value * k);
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
            for (int i = 0; i < d; i++)
                    dInPow10 *= 10;
            return dInPow10;
        }

        abstract double roundFunction(double value);

        private int round(double roundedValue, RoundMethod roundMethod, int d) {
            int tenPow = pow10(d);
            int result = (int)roundMethod.roundFunction(roundedValue / tenPow) * tenPow;
            return result;
        }
    }

    public Byn mul(double k, RoundMethod roundMethod, int d){
        return new Byn(roundMethod.round(value * k, roundMethod, d));
    }

    public Byn round(RoundMethod roundMethod, int d){
        return new Byn(roundMethod.round(value, roundMethod, d));
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
