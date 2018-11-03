package com.kodilla.exception.test;

public class FlightExceptionHandling {

    public static void main(String[] arg) {

        SearchFlight searchFlight = new SearchFlight();

        Flight flight = new Flight("London", "Moscow");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight1 = new Flight("Moscow", "Paris");


        try {
            searchFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception \"" + e.toString() + "\" has been caught and handled");
        }

        try {
            searchFlight.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception \"" + e.toString() + "\" has been caught and handled");
        }

        try {
            searchFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception \"" + e.toString() + "\" has been caught and handled");
        }

    }
}