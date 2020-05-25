package by.gsu.pms.comparators;

import by.gsu.pms.interfaces.Playroom;

import java.util.Comparator;

public class GetTotalNumberToysComparator implements Comparator<Playroom> {
    @Override
    public int compare(Playroom r1, Playroom r2) {
        return r1.getTotalNumberToys() - r2.getTotalNumberToys();
    }
}
