package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle vehicle = new Vehicle(1,5,60);
        System.out.println(vehicle.Desc());
        Car car = new Car(1,5,67,"Tesla");
        System.out.println(car.Desc());
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(5,6);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getRadius());
    }
}
