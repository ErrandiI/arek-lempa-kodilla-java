package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> countriesOnContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesOnContinent() {
        return countriesOnContinent;
    }

    public void addCountry(Country country) {
        countriesOnContinent.add(country);
    }
}
