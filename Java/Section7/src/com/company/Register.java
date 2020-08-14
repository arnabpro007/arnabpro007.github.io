package com.company;

import java.util.ArrayList;

public class Register extends Read implements ISaveable {
    private String schoolName;
    private ArrayList<String> register;

    @Override
    public ArrayList<String> save() {
        return readValues();

    }

    @Override
    public void importing(ArrayList<String> stringArrayList) {
        register = (ArrayList<String>) stringArrayList.clone();
        System.out.println("Finished Importing");
    }

    public void print(){
        String s = register.toString();
        System.out.println("Printing " + schoolName +" school register: \n" + s );
    }


    public Register(String schoolName) {
        this.schoolName = schoolName;
    }
}
