package com.company;

public class Car extends Vehicle{
    private String name;

    public Car(int steer, int gear, int speed, String name) {
        super(steer, gear, speed);
        this.name = name;
    }
    public String Desc1(){
        return ("Car name is : "+ name);
    }
    @Override
    public String Desc() {

        return Desc1() +"\n"+ super.Desc();
    }
}
