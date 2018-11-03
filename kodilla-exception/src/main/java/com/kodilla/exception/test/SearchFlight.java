package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Moscow", true);
        airports.put("London", true);


        if (airports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Airport " + flight.getArrivalAirport() + " exists in database.");
        } else {
            throw new RouteNotFoundException("There is no such an airport available!");
        }

    }
}