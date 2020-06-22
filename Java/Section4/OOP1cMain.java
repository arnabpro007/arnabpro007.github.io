package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bank arnab = new bank();
        arnab.setBalance(11000);
        arnab.setContact("7278107091");
        arnab.setEmail("arnab1998tyt17@gmail.com");
        arnab.setName("Arnab Mukherjee");
        arnab.update(2000);
        arnab.withdraw(15000);
        arnab.Statement();
        bank arnab1 = new bank("Arnab","arnabpro007@gmail.com",11000,"9433658088");
        arnab1.Statement();

        Wall wall = new Wall(5,4);
        System.out.println(wall.getArea());
        wall.setHeight(-1.5);
        System.out.println(wall.getHeight());

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));
        Point point = new Point();
        System.out.println(point.distance());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
