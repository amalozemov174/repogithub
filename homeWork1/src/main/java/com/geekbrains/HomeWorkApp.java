package com.geekbrains;

public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //Задание 1
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Задание 2
    public static void checkSumSign(){
        int a = -5;
        int b = 2;
        int sum = a + b;

        if(sum >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Задание 3
    public static void printColor(){
        int value = 98;

        if(value <= 0){
            System.out.println("Красный");
        }
        else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else if(value > 100){
            System.out.println("Зеленый");
        }
    }
    //Задание 4
    public static void compareNumbers(){
        int a = 3;
        int b = 2;

        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
