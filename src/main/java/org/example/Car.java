package org.example;

class Car extends Vehicle{




    @Override
    public float accelerate(float kmh) {
        velocity+= kmh;
        System.out.println("Neue Geschwindigkeit: " + velocity+" km/h");
        return velocity;
    }

    @Override
    public void brake(){
        velocity=0;
        System.out.println( "hat gebremst auf 0!");
    }


    public Car(int id, String name, float velocity) {
        super(id, name, velocity);
    }
}

