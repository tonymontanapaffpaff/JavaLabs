import by.gsu.pms.beans.Byn;
import by.gsu.pms.beans.groups.Kindergartners;
import by.gsu.pms.beans.groups.Nursery;
import by.gsu.pms.beans.groups.Preschoolers;
import by.gsu.pms.beans.toys.*;
import by.gsu.pms.comparators.GetTotalNumberToysComparator;
import by.gsu.pms.constants.Consts;
import by.gsu.pms.constants.ToysPrices;
import by.gsu.pms.interfaces.Playroom;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Runner {

    private static void printCollection(List<Playroom> list) {
        for (Playroom playroom : list) {
            System.out.println(playroom);
        }
    }
    public static void main(String[] args) {
        Scanner sc1 = null;
        Scanner sc2 = null;
        try {
            sc1 = new Scanner(new FileReader(Consts.INPUT));
            List<Playroom> list = new ArrayList<>();
            String group = "";
            int index = 0;
            while (sc1.hasNext()) {
                String[] line = sc1.nextLine().split(Consts.SPLIT_FIELDS);
                if (line[0].equals(Consts.SMALL_GROUP)) {
                    Cars cars = new Cars(line[1]);
                    Dolls dolls = new Dolls(line[2]);
                    Cubes cubes = new Cubes(line[3]);
                    list.add(new Nursery(cars, dolls, cubes));
                    Byn nurseryBudget = new Byn(0);
                    nurseryBudget = nurseryBudget.add(ToysPrices.CARS.mul(cars.getNumber()));
                    nurseryBudget = nurseryBudget.add(ToysPrices.DOLLS.mul(dolls.getNumber()));
                    nurseryBudget = nurseryBudget.add(ToysPrices.CUBES.mul(cubes.getNumber()));
                    if (nurseryBudget.compareTo(Nursery.BUDGET) > 0) {
                        System.out.println("In " + index + " element in the list budget exceeded");
                        index++;
                    } else {
                        System.out.println("In " + index + " element in the list all is well with the budget");
                        index++;
                    }
                } else if (line[0].equals(Consts.MEDIUM_GROUP)) {
                    Balls balls = new Balls(line[1]);
                    BigCars bigCars = new BigCars(line[2]);
                    Cubes cubes = new Cubes(line[3]);
                    Dolls dolls = new Dolls(line[4]);
                    list.add(new Kindergartners(balls, bigCars, cubes, dolls));
                    Byn kindergartnersBudget = new Byn(0);
                    kindergartnersBudget = kindergartnersBudget.add(ToysPrices.BALLS.mul(balls.getNumber()));
                    kindergartnersBudget = kindergartnersBudget.add(ToysPrices.BIG_CARS.mul(bigCars.getNumber()));
                    kindergartnersBudget = kindergartnersBudget.add(ToysPrices.CUBES.mul(cubes.getNumber()));
                    kindergartnersBudget = kindergartnersBudget.add(ToysPrices.DOLLS.mul(dolls.getNumber()));
                    if (kindergartnersBudget.compareTo(Nursery.BUDGET) > 0) {
                        System.out.println("In " + index + " element in the list budget exceeded");
                        index++;
                    } else {
                        System.out.println("In " + index + " element in the list all is well with the budget");
                        index++;
                    }
                } else if (line[0].equals(Consts.OLDER_GROUP)) {
                    Cars cars = new Cars(line[1]);
                    SmallCars smallCars = new SmallCars(line[2]);
                    BigCars bigCars = new BigCars(line[3]);
                    Dolls dolls = new Dolls(line[4]);
                    list.add(new Preschoolers(cars, smallCars, bigCars, dolls));
                    Byn preschoolersBudget = new Byn(0);
                    preschoolersBudget = preschoolersBudget.add(ToysPrices.CARS.mul(cars.getNumber()));
                    preschoolersBudget = preschoolersBudget.add(ToysPrices.SMALL_CARS.mul(smallCars.getNumber()));
                    preschoolersBudget = preschoolersBudget.add(ToysPrices.BIG_CARS.mul(bigCars.getNumber()));
                    preschoolersBudget = preschoolersBudget.add(ToysPrices.DOLLS.mul(dolls.getNumber()));
                    if (preschoolersBudget.compareTo(Nursery.BUDGET) > 0) {
                        System.out.println("In " + index + " element in the list budget exceeded");
                        index++;
                    } else {
                        System.out.println("In " + index + " element in the list all is well with the budget");
                        index++;
                    }
                }
            }

            System.out.println("Before sorting:");
            printCollection(list);

            Collections.sort(list, new GetTotalNumberToysComparator());

            System.out.println("After sorting:");
            printCollection(list);

            System.out.println("Groups with toys number more than 50:");
            for (Playroom playroom : list) {
                if (playroom.getTotalNumberToys() >= Consts.TOYS_LIMIT) {
                    System.out.println(playroom);
                }
            }

            System.out.println("What can we do?");
            System.out.println("1. Children go for a walk");
            System.out.println("2. Children feeding");
            System.out.println("3. Give children to parents");
            sc2 = new Scanner(System.in);
            int action = sc2.nextInt();

            if (action == Consts.WALK) {
                for (Playroom playroom : list) {
                    playroom.goForAWalk();
                }
            } else if (action == Consts.FEEDING) {
                for (Playroom playroom : list) {
                    playroom.feedChildren();
                }
            } else if (action == Consts.GIVE) {
                for (Playroom playroom : list) {
                    playroom.giveChildren();
                }
            } else {
                System.out.println("Wrong value");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File doesn't exists");
        } finally {
            if (sc1 != null) {
                sc1.close();
            }
            if (sc2 != null) {
                sc2.close();
            }
        }
    }
}
