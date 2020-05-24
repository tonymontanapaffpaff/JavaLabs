import by.gsu.pms.Airline;
import by.gsu.pms.PlaneType;
import by.gsu.pms.Utility;
import by.gsu.pms.WeekDay;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Runner {

    private static WeekDay[] getWeekDay(String[] weekDaysLine) {
        WeekDay[] weekDay = new WeekDay[weekDaysLine.length];
        for (int i = 0; i < weekDay.length; i++) {
            if (weekDaysLine[i].equals(WeekDay.MONDAY.name())) {
                weekDay[i] = WeekDay.MONDAY;
            }
            if (weekDaysLine[i].equals(WeekDay.TUESDAY.name())) {
                weekDay[i] = WeekDay.TUESDAY;
            }
            if (weekDaysLine[i].equals(WeekDay.WEDNESDAY.name())) {
                weekDay[i] = WeekDay.WEDNESDAY;
            }
            if (weekDaysLine[i].equals(WeekDay.THURSDAY.name())) {
                weekDay[i] = WeekDay.THURSDAY;
            }
            if (weekDaysLine[i].equals(WeekDay.FRIDAY.name())) {
                weekDay[i] = WeekDay.FRIDAY;
            }
            if (weekDaysLine[i].equals(WeekDay.SATURDAY.name())) {
                weekDay[i] = WeekDay.SATURDAY;
            }
            if (weekDaysLine[i].equals(WeekDay.SUNDAY.name())) {
                weekDay[i] = WeekDay.SUNDAY;
            }
        }
        return weekDay;
    }

    private static void printCollection(List<Airline> list) {
        for (Airline airline : list) {
            System.out.println(airline);
        }
    }

    public static void main(String[] args) {
        final String INPUT = "src/in.csv";
        final String OUTPUT = "src/out.csv";
        final String SPLIT_LINE = ";";
        final String SPLIT_WEEKDAYS_LINE = ",";
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(INPUT));
            List<Airline> list = new ArrayList<>();
            while (sc.hasNext()) {
                String[] line = sc.nextLine().split(SPLIT_LINE);
                String destination = line[0];
                int flightNumber = Integer.parseInt(line[1]);
                PlaneType planeType = PlaneType.values()[Integer.parseInt(line[2])];
                int departureTime = Integer.parseInt(line[3]);
                String[] weekDaysLine = line[4].split(SPLIT_WEEKDAYS_LINE);
                WeekDay[] weekDays = getWeekDay(weekDaysLine);
                list.add(new Airline(destination, flightNumber, planeType, departureTime, weekDays));
            }

            System.out.println("Before sorting:");
            printCollection(list);

            List<Airline> listSearchingDestination = new ArrayList<>();
            String searchingDestination = "Moscow";
            List<Airline> listSearchingWeekDay = new ArrayList<>();
            WeekDay searchingWeekDay = WeekDay.MONDAY;
            List<Airline> listSearchingWeekDayWithTime = new ArrayList<>();
            int searchingTime = 1300;

            for (Airline airline : list) {
                if (airline.getDestination().equals(searchingDestination)) {
                    listSearchingDestination.add(airline);
                }
                for (int i = 0; i < airline.getWeekDays().length; i++) {
                    if (airline.getWeekDays()[i].equals(searchingWeekDay)) {
                        listSearchingWeekDay.add(airline);
                        if (airline.getDepartureTime() > 1300) {
                            listSearchingWeekDayWithTime.add(airline);
                        }
                    }
                }
            }

            System.out.println("List of flights for " + searchingDestination + " destination:");
            printCollection(listSearchingDestination);

            System.out.println("List of flights for " + searchingWeekDay + ":");
            printCollection(listSearchingWeekDay);

            System.out.println("List of flights for " + searchingWeekDay + " and searching time " + Utility.toConvert(searchingTime) + ":");
            printCollection(listSearchingWeekDayWithTime);

            Collections.sort(list);

            try {
                FileWriter writer = new FileWriter(OUTPUT, false);
                for (Airline airline : list) {
                    writer.write(airline + "\n");
                }
                writer.flush();
                writer.close();
            } catch (IOException e2) {
                System.err.println("Some problems with output");
            }
        } catch (IOException e1) {
            System.err.println("Some problems with input");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
