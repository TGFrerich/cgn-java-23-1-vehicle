package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car auto = new Car(123, "BMW",100);
    @Test
    void accelerateIsCorrect() {

        auto.accelerate(16);
        assertEquals(116, auto.velocity);

    }

    @Test
    void brakeIsCorrect() {
        auto.brake();
        assertEquals(0, auto.velocity);
    }
}