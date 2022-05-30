package me.karunarathne.Kuppiya.Zoo;

public class Main {
    public static void main(String[] args) {
        Dog lassie = new Dog("Lassie");
        Cat tom = new Cat("Tom");
        Fish myFish = new Fish("Some Random Fish");

        lassie.eat();
        myFish.eat();

        lassie.walk();
        tom.walk();

        myFish.swim();

        Animal someAnimal = new Animal("Vlad") {
            @Override
            public void eat() {
                someMethod();
                System.out.println("An unknown animal is eating something...");
            }

            private void someMethod() {
                System.out.println("Some method was called...!");
            }
        };

        someAnimal.eat();
    }
}
