package com.kodilla.good.patterns.challanges.Flights;

public class FlightRunner {
    public static void main(String[] args) {
        FlightNetwork flightNetwork = new FlightNetwork();
        System.out.println(flightNetwork.flightFromFilter("WAW"));
        System.out.println(flightNetwork.flightToFilter("BER"));
        System.out.println(flightNetwork.flightThroughFilter("WAW","BER","LON"));
        System.out.println(flightNetwork.flightThroughFilter("WAW","HAM","LON"));
    }
}