package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //Getter for first number
    public double getFirstNumber(){
        return this.firstNumber;

    }
    //Getter for second number
    public double getSecondNumber(){
        return this.secondNumber;
    }

    //Setter for first number
    public void setFirstNumber(double x){
        this.firstNumber = x;
    }

    //Setter for second number
    public void setSecondNumber(double x){
        this.secondNumber = x;
    }
    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        }else {
            return this.firstNumber/this.secondNumber;
        }
    }
}
