package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 2; i <= 8 ; i++) {
            System.out.println(CalculateInterest(10000,i));
        }
        int m = 0;
        for(int i =1; i <=1000 ; i++){
            if (isPrime(i)){
                m = m+1;
                if (m<=50){
                System.out.println(i);
            }else {
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }




    }
    public static boolean isPrime(int n){
        if (n ==1){
            return false;
        }
        for (int i = 2;i<=n/2;i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }


    public static double CalculateInterest(double amount , double interest){
        return (amount*interest/100);
    }
}
