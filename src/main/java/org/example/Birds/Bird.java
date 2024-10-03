package org.example.Birds;

public abstract class Bird extends Animal implements Flyable {
    protected Object feather;

    public Object getFeather() {
        return feather;
    }

    public String getColor() {
        return color;
    }

    protected String color;

    Bird(String color) {
        this.color = color;
    }

    Bird() {

    }
}
