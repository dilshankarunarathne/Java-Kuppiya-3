package me.karunarathne.Kuppiya.Zoo;

public class Dog
        extends Animal
        implements WalkableAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating dog food...");
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + " is walking on the roof...");
    }
}
