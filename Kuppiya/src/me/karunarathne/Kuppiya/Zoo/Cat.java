package me.karunarathne.Kuppiya.Zoo;

public class Cat
        extends Animal
        implements WalkableAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating cat food...");
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + " is walking on the road...");
    }
}
