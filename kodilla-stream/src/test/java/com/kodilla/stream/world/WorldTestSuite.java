package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country = new Country("Polska", new BigDecimal("40000"));
        Country country1 = new Country("Niemcy", new BigDecimal("60000"));
        Country country2 = new Country("Meksyk", new BigDecimal("30000"));
        Country country3= new Country("Canada", new BigDecimal("70000"));
        Country country4 = new Country("Maroko", new BigDecimal("10000"));

        Continent continent = new Continent("Europe");
        Continent continent2 = new Continent("North America");
        Continent continent3 = new Continent("Africa");

        continent.addCountry(country);
        continent.addCountry(country1);

        continent2.addCountry(country2);
        continent2.addCountry(country3);

        continent3.addCountry(country4);

        World world = new World();

        world.addContinents(continent);
        world.addContinents(continent2);
        world.addContinents(continent3);

        //When
        BigDecimal totalPeoples = new BigDecimal("210000");
        BigDecimal quantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(totalPeoples, quantity);
    }
}
