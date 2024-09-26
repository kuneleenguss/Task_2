package org.example.Birds;

public abstract class ColoredBird extends Bird {
    protected final String color;

    public ColoredBird(String color) {
        this.color = color;
    }
}
