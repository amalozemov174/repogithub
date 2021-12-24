package com.geekbrains;

import java.util.GregorianCalendar;

public class homeWork2 {
    public static void main(String[] args) {
        System.out.println(compareNumbers(5,1));
        isPositive(-5);
        System.out.println(isNegative(5));
        printStrings("Строка", 5);
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYearCycles(2200));
    }
    //Задание 1
    public static boolean compareNumbers(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }
    }
    //Задание 2
    public static void isPositive(int a){
        if (a >= 0){
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }
    //Задание 3
    public static boolean isNegative(int a){
        if (a >= 0){
            return false;
        }
        else {
            return true;
        }
    }
    //Задание 4
    public static void printStrings(String str, int count){
        for (int i = 0; i < count; i++){
            System.out.println(str);
        }
    }
    //Задание 5 через класс GregorianCalendar
    public static boolean isLeapYear(int year){
        return new GregorianCalendar().isLeapYear(year);
    }
    //Задание 5 через if
    public static boolean isLeapYearCycles(int year){
        if(year % 4 == 0){
            if(year % 100 == 0 && (year / 100) % 4 != 0){
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
