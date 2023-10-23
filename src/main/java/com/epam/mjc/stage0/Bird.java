package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }
    @Override
    public String getDescription() {
        String s = super.getDescription();
        String z = " Moreover, it has 2 wings and can fly.";
        return s+z;
    }
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.getDescription();
        Dog dog = new Dog();
        dog.getDescription();
        Animal animal = new Animal("red", 3, false);
        animal.getDescription();
    }
}

