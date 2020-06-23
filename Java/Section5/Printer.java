package com.company;

public class Printer {
    private int pages;
    private double ink = 100;
    private boolean duplex;

    public Printer(int pages, double ink, boolean duplex) {
        this.pages = pages;
        if(this.ink>0 && this.ink<=100){
            this.ink = ink;
        }
        this.duplex = duplex;
    }
    public void inkfill(double y){
        if (this.ink + y <= 100 && y>= 0){
            this.ink = this.ink + y;
        }else if(this.ink + y >100){
            this.ink =100;
        }
        System.out.println("Your ink level is: "+this.ink +"%");
    }
    public void print(int numpage){
        if (this.duplex == true){
            if (this.pages >= numpage/2){
                System.out.println("Starting the Print");
                System.out.println("Printed "+ numpage/2 + " pages");
                System.out.println("Remaining: "+ (this.pages - numpage/2));
            }else{
                System.out.println("Insufficient pages");
                System.out.println("Only printed: "+ this.pages +" pages");
            }
        }else{
            if (this.pages >= numpage){
                System.out.println("Starting the Print");
                System.out.println("Printed "+ numpage+ " pages");
                System.out.println("Remaining: "+ (this.pages - numpage));
            }else{
                System.out.println("Insufficient pages");
                System.out.println("Only printed: "+ this.pages +" pages");
            }
        }
    }
}
