package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Rex");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Indian Parrot");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguin penguin = new Penguin("emperor");
        penguin.fly();


        System.out.println("Rick List Challange");
        RickList value1 = new RickList(5) {
            @Override
            public RickList gotonext() {
                return null;
            }

            @Override
            public RickList gotoprevious() {
                return null;
            }
        };
        RickList value2 = new RickList(15) {
            @Override
            public RickList gotonext() {
                return null;
            }

            @Override
            public RickList gotoprevious() {
                return null;
            }
        };

        RickList value3 = new RickList(-5) {
            @Override
            public RickList gotonext() {
                return null;
            }

            @Override
            public RickList gotoprevious() {
                return null;
            }
        };

        RickMain rickMain = new RickMain();
        rickMain.addItem(value1);
        rickMain.addItem(value2);
        rickMain.addItem(value3);
    }
}
