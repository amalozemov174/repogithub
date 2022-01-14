package com.geekbrains;

public class Main {
    public static void main(String[] args){
        Cat[] cats = {new Cat("Barsik0", 40), new Cat("Barsik1", 30),
                new Cat("Barsik2", 50), new Cat("Barsik3", 80)};

        Plate plate = new Plate(150);
        plate.info();

        for (Cat c: cats) {
            c.eat(plate);
            c.printFill();
        }

        plate.info();
        plate.addFood(50);
        plate.info();
    }
}
