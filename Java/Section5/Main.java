package com.company;

import java.awt.*;
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    @Override
    public String plot(){
        return "a shark eats lots of people";
    }
}

class Independence extends Movie{
    public Independence(){
        super("Independence");
    }

    @Override
    public String plot() {
        return "aliens attempt to take over";
    }
}
class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class Starwars extends Movie{
    public Starwars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Emperor  sucks";
    }
}

class forgettableMovies extends Movie{
    public forgettableMovies(){
        super("Forgettables!");
    }
}




public class Main {

    public static void main(String[] args) {
	// write your code here
        //Compositions:
        Case.Dimensions dimensions = new Case.Dimensions(23,25,25);
        Case thecase = new Case("Arnab","Rick",dimensions);
        Monitor.Resolution resolution = new Monitor.Resolution(25,25);
        Monitor monitor = new Monitor("Arnab_MON","Rick_Mon",25,resolution);
        Motherboard motherboard = new Motherboard("Arnab_MOTH","RICK_MOTH",8,12,"Keeggoz");
        PC pc = new PC(thecase, monitor, motherboard);
        pc.getMotherboard().LoadProgram("Prog123");
        pc.getMonitors().drawPixel(5,6,"RED");
        pc.getThecase().pressPower();
        //Encapsulation:
        Player player = new Player();
        player.name = "Arnab";
        player.health = 20;
        player.weapon = "Nuke";

        int damage = 10;
        player.loosehealth(damage);
        Printer printer = new Printer(20,75,false);
        printer.inkfill(20);
        printer.print(30);

        for (int i = 1; i < 11 ; i++) {
            Movie u = randomMovie();
            System.out.println(u.plot());
        }



    }

    private static Movie randomMovie() {
        int random = (int)(Math.random()*5) + 1 ;
        System.out.println("Random number generated: "+ random);
        switch (random){
            case 1:
                return new Jaws();

            case 2:
                return new Independence();
            case 3:
                return new  MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new forgettableMovies();

        }
        return null;
    }
}
