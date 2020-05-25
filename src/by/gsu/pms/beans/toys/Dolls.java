package by.gsu.pms.beans.toys;

import by.gsu.pms.constants.Consts;

public class Dolls {
    private int number;
    private boolean canSpeak;

    public Dolls() {
    }

    public Dolls(String line) {
        String[] dolls = line.split(Consts.SPLIT_INNER);
        this.number = Integer.parseInt(dolls[0]);
        if (dolls[1].equals(Consts.YES)) {
            this.canSpeak = true;
        } else if (dolls[1].equals(Consts.NO)) {
            this.canSpeak = false;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public String toString() {
        return number + "," + canSpeak;
    }
}
