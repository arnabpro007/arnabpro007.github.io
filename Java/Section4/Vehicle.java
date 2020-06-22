package com.company;

public class Vehicle {
    private int steer;
    private int gear;
    private  int speed;

    public Vehicle() {
    }

    public Vehicle(int steer, int gear, int speed) {
        this.steer = steer;
        this.gear = gear;
        this.speed = speed;
    }

    public String Desc(){
        return ("Your vehicle Description: "+"\n" + "steering: " +steer + "\n"+
                "Gear: "+gear +"\n" + "Speed: "+ speed);
    }
}
