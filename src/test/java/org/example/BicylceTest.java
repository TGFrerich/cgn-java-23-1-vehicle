package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicylceTest {

    Bicylce rad = new Bicylce(124, "Cube", 20);
    @Test
    void accelerateIsCorrect() {

        rad.accelerate(15);
        assertEquals(35, rad.velocity);
    }

    @Test
    void brakeIsCorrect() {
        rad.brake();
        assertEquals(0, rad.velocity);
    }
}