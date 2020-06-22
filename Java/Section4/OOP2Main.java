package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Num1",1,1,5,5);
        Dog dog = new Dog("Num2",2,2,2,2,2,2,"silky");

        dog.run();
        dog.walk();
    }
}
