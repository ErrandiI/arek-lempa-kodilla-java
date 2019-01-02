package com.kodilla.good.patterns.challanges.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightConnections {
    private final List<Flights> FlightConnections = new ArrayList<>();
    public FlightConnections() {
        FlightConnections.add(new Flights("WAW", "BER"));
        FlightConnections.add(new Flights("WAW", "LON"));
        FlightConnections.add(new Flights("LON", "LAS"));
        FlightConnections.add(new Flights("BER", "WAW"));
        FlightConnections.add(new Flights("BER", "LON"));
    }
    public List<Flights> getFlightsList() {
        return new ArrayList<>(FlightConnections);
    }
}