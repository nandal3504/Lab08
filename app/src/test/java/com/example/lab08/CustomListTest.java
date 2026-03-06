package com.example.lab08;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomListTest {
    private CustomList customList;
    private City edmonton;
    private City calgary;

    @Before
    public void setUp() {
        customList = new CustomList();
        edmonton = new City("Edmonton", "Alberta");
        calgary = new City("Calgary", "Alberta");
    }

    @Test
    public void testAddCity() {
        customList.addCity(edmonton);
        assertTrue(customList.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        assertEquals(0, customList.countCities());

        customList.addCity(edmonton);
        assertEquals(1, customList.countCities());

        customList.addCity(calgary);
        assertEquals(2, customList.countCities());

        customList.deleteCity(edmonton);
        assertEquals(1, customList.countCities());
    }

}