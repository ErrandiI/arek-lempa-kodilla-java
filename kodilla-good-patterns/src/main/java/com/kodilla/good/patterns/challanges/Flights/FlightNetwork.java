package com.kodilla.good.patterns.challanges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightNetwork {

    public List flightToFilter(String arrAirport){
        FlightConnections flightConnections = new FlightConnections();
        System.out.println("Showing routes to: " + arrAirport);
        return flightConnections.getFlightsList().stream()
                .filter(flights -> flights.getArrAirport().equals(arrAirport))
                .collect(Collectors.toList());
    }

    public List flightFromFilter(String depAirport){
        FlightConnections flightConnections = new FlightConnections();
        System.out.println("Showing routes from " + depAirport);
        return flightConnections.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport().equals(depAirport))
                .collect(Collectors.toList());
    }

    public List flightThroughFilter(String depAirport,String throughAirport, String arrAirport){
        FlightConnections flightConnections = new FlightConnections();
        System.out.println("Showing routes from " +depAirport + " through " + throughAirport + " to " +arrAirport);
        List list1 = flightConnections.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport().equals(depAirport))
                .filter(flights -> flights.getArrAirport().equals(throughAirport))
                .collect(Collectors.toList());

        List list2 = flightConnections.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport().equals(throughAirport))
                .filter(flights -> flights.getArrAirport().equals(arrAirport))
                .collect(Collectors.toList());
        List finalList = new ArrayList();
        finalList.add(list1);
        finalList.add(list2);
        return finalList;
    }
}
