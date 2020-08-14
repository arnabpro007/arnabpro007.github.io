package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrnt = new Button("Print");
    public static void main(String[] args) {
	// write your code here


        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        btnPrnt.setOnClickListener(new ClickListener());
        //Listen();
        btnPrnt.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " wins!");
            }
        });
        Listen();
        /*ITelephone ArnabPhone;
        ArnabPhone = new DeskPhone(1235);
        ArnabPhone.PowerOn();
        ArnabPhone.answer();
        ArnabPhone.dial(123);
        ArnabPhone.callPhone(1235);
        ArnabPhone.isRinging();

        System.out.println("===============");
        ArnabPhone = new MobilePhone(7777);
        ArnabPhone.callPhone(00000);
        ArnabPhone.answer();
        ArnabPhone.dial(111);
        ArnabPhone.PowerOn();
        ArnabPhone.callPhone(7777);
        ArnabPhone.dial(111);
        ArnabPhone.answer();*/
        /*ISaveable pathbhavan;
        pathbhavan = new Register("Path Bhavan");
        ArrayList<String> tempRegister = pathbhavan.save();
        //System.out.println(tempRegister.get(0));
        System.out.println("Now importing entered values to the main register");
        pathbhavan.importing(tempRegister);
        pathbhavan.print();*/

        /*GearBox maruti = new GearBox(5);
        //GearBox.Gear first = maruti.new Gear(1,12.3);
        //System.out.println(first.driveSpeed(1000));
        maruti.addGear(1,1.5);
        maruti.addGear(2,2.1);
        System.out.println(maruti.driveSpeed(2000));*/


    }
    private static void Listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrnt.onClick();
            }
        }
    }
}

