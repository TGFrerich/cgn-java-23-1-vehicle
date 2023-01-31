package org.example;

public class Bicylce extends Vehicle{


    public Bicylce(int id, String name, float velocity) {
        super(id, name, velocity);
    }

    @Override
    public float accelerate(float kmh) {
        if (velocity + kmh <= 35) {
            velocity += kmh;
            System.out.println("Neue Geschwindigkeit: " + velocity + " km/h");
            return velocity;
        }
        else{
            System.out.println("Zu schnell! Bleibe unter 35 km/h");
            return velocity;
        }
    }

    @Override
    public void brake(){
        velocity=0;
        System.out.println("hat gebremst auf 0!");
    }
}
