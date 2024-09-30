package org.example.Birds;

class Penguin extends ColoredBird implements Walkable{
    public Penguin() {
        super("black");
    }

    @Override
    public void fly() {
        System.out.println(color);
        System.out.println("Penguin can't fly :(");
    }

    @Override
    public void walk() {
        System.out.println("Penguin can walk :)");
    }
}
