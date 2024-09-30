package org.example.Birds;

class Kanarejka extends ColoredBird implements Singable{
    public Kanarejka() {
        super("yellow");
    }

    @Override
    public void fly() {
        System.out.println("Kanarejka can fly :)");
    }

    @Override
    public void sing() {
        System.out.println("Kanarejka can sing :)");
    }
}
