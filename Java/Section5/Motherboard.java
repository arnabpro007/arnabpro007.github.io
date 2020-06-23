package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int RAM;
    private int Graphics;
    private String buyer;

    public Motherboard(String model, String manufacturer, int RAM, int graphics, String buyer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.RAM = RAM;
        Graphics = graphics;
        this.buyer = buyer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRAM() {
        return RAM;
    }

    public int getGraphics() {
        return Graphics;
    }

    public String getBuyer() {
        return buyer;
    }

    public void LoadProgram(String x){
        System.out.println((x + " model: "+ model + "manufacturer: " +manufacturer + "\n" +
                "RAM: " + RAM +"\n" + "Graphics: "+ Graphics + "\n"+
                "Buyer: "+ buyer));
    }
}
