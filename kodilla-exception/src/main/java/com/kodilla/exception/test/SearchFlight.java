package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Moscow", false);
        airports.put("London", true);


        if (!airports.containsKey(flight.getArrivalAirport()))
            throw new RouteNotFoundException("There is no such an airport available!");
        else {
            return airports.get(flight.getArrivalAirport());
        }

    }
}