package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Rex");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Indian Parrot");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguin penguin = new Penguin("emperor");
        penguin.fly();
    }
}
