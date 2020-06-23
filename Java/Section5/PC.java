package com.company;

public class PC {
    private Case thecase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitors, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public Case getThecase() {
        return thecase;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }


}
