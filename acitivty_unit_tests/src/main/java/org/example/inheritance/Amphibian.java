package org.example.inheritance;

public class Amphibian extends Animal {
    public Frog(String name){
        super();
    }
    @Override
    public void eat() {
        System.out.println("eating frog");
    }

    @Override
public void makeSound() {
        System.out.println("frog makes sounds")
    }
}
