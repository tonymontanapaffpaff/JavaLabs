package by.gsu.pms.beans.toys;

import by.gsu.pms.constants.Consts;

public class BigCars extends Cars {
    private boolean remoteControl;

    public BigCars() {
    }

    public BigCars(String line) {
        String[] bigCars = line.split(Consts.SPLIT_INNER);
        super.setNumber(Integer.parseInt(bigCars[0]));
        super.setColor(bigCars[1]);
        if (bigCars[2].equals(Consts.YES)) {
            this.remoteControl = true;
        } else if (bigCars[2].equals(Consts.NO)) {
            this.remoteControl = false;
        }
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return super.toString() + "," + remoteControl;
    }
}
