package com.company;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loosehealth(int damage){
        this.health = this.health - damage;
        if (this.health<1){
            System.out.println("KONOCK OUT!");
        }else {
            System.out.println("HEALTH DOWN TO: "+this.health);
        }
    }

}
