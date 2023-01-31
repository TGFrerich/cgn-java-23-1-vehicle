package org.example;

public abstract class Vehicle implements Acceleratable, Braking {

    int id;
    String name;

    float velocity;


    public Vehicle(int id, String name, float velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
