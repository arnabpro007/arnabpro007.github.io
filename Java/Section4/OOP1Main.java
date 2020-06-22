package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Char Arnab = new Char();
        Char Rick = new Char();
        Arnab.setX(-67);
        System.out.println(Arnab.getX());

        //Test Code for Simple Calculator
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(0);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getDivisionResult());
        System.out.println((calculator.getMultiplicationResult()));
        System.out.println(calculator.getSubtractionResult());

        //Test Code for Person
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Smith");
        person.setAge(19);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }
}
