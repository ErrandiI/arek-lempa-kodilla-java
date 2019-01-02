package com.kodilla.good.patterns.challanges.Flights;

import java.util.Objects;

public class Flights {
    private final String depAirport;
    private final String arrAirport;

    public Flights(final String depAirport, final String arrAirport) {
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(depAirport, flights.depAirport) &&
                Objects.equals(arrAirport, flights.arrAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depAirport, arrAirport);
    }

    @Override
    public String toString() {
        return "Flights{" +
                "depAirport='" + depAirport + '\'' +
                ", arrAirport='" + arrAirport + '\'' +
                '}';
    }
}