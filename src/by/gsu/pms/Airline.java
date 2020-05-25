package by.gsu.pms;

import java.util.Arrays;

public class Airline implements Comparable<Airline> {
    private String destination;
    private int flightNumber;
    private PlaneType planeType;
    private int departureTime;
    private WeekDay[] weekDays;

    public Airline() {
    }

    public Airline(String destination, int flightNumber, PlaneType planeType, int departureTime, WeekDay[] weekDays) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.weekDays = weekDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public WeekDay[] getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(WeekDay[] weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public String toString() {
        return destination + ";" + flightNumber + ";" + planeType + ";" + Utility.toConvert(departureTime) + ";" + Arrays.toString(weekDays);
    }

    @Override
    public int compareTo(Airline airline) {
        return destination.compareTo(airline.getDestination());
    }
}
