package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureServiceTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureService.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void testNegativeTemperature() {
        assertEquals(-40, TemperatureService.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void testHighTemperature() {
        assertEquals(212, TemperatureService.celsiusToFahrenheit(100), 0.001);
    }
}
