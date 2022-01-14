package com.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean fill;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fill = false;
    }
    public void eat(Plate p) {
        if(p.decreaseFood(appetite)){
            fill = true;
        }
        else {
            fill = false;
        }
    }

    public void printFill(){
        if(fill){
            System.out.println("Котик " + name + " сытый");
        }
        else {
            System.out.println("Котик " + name + " голодный");
        }
    }

}
