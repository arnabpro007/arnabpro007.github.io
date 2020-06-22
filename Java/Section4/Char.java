package com.company;

public class Char {
    private int x;
    private int length;
    private String name;
    //Setter
    public void setX(int inp){
        int validX = x;
        if(x>0){
            this.x = inp;
        }else {
            this.x = inp*(-1);
        }


    }
    //Getter
    public int getX(){
        return this.x;
    }
}
