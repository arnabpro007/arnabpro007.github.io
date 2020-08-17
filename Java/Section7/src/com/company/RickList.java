package com.company;

public abstract class RickList {
    private double value;
    private RickList next;
    private RickList previous;

    public RickList(double value) {
        this.value = value;
    }

    public RickList(double value, RickList next, RickList previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public double getValue() {
        return value;
    }

    public RickList getNext() {
        return next;
    }

    public RickList getPrevious() {
        return previous;
    }
    public abstract RickList gotonext();
    public abstract RickList gotoprevious();

    public int compareto(RickList parameter) {
        if (parameter.value == this.value){
            return 0;
        }else if(parameter.value > this.value){
            return 1;
        }else{
            return -1;
        }
    }


}
