package com.company;

public class bank {
    private String name;
    private String email;
    private int balance;
    private String contact;
    public bank(String name, String email, int balance,String contact){
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.contact = contact;
    }
    public int getBalance() {
        return this.balance;
    }

    public String getContact() {
        return this.contact;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setBalance(int balance) {
        if(balance>0) {
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(int x){
        if(x > 0){
           this.balance +=  x;
        }

    }
    public void withdraw(int y){
        if(y>0 && this.balance - y >=0){
            this.balance -= y;
        }else {
            System.out.println("ERROR Cannot complete the transaction!");
        }
    }

    public void Statement(){
        System.out.println("User Name: "+ this.name);
        System.out.println("Email id: "+ this.email);
        System.out.println("Contact: +91"+this.contact);
        System.out.println("Balance: "+this.balance);
    }
}
