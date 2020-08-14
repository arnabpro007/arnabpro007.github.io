package com.company;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int CurrentGear = 1;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

    }
    public void addGear(int number, double ratio){
        if((number>0)&&(number<= maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }
    public double driveSpeed(int revs){
        return revs*(this.CurrentGear);
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }


    }
}
