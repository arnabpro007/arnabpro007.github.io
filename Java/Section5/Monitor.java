package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeRes;

    public Monitor(String model, String manufacturer, int size, Resolution nativeRes) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeRes = nativeRes;
    }

    public void drawPixel(int x , int y, String Color){
        System.out.println("("+x+","+y+")" + "  Color: "+ Color);

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeRes() {
        return nativeRes;
    }

    public static class Resolution{
        private int x;
        private int y;

        public Resolution(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
