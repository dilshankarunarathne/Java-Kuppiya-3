package me.karunarathne.Kuppiya.Zoo;

public class Fish
        extends Animal
        implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating fish food...");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " is swimming...");
    }

    @Override
    public void breatheUnderWater() {
        System.out.println("shdafasf");
    }
}
