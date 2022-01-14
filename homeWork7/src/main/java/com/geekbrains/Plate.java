package com.geekbrains;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        int res = food - n;
        if(res < 0){
            System.out.println("В миске недостаточное еды");
            return false;
        }
        else {
            food = res;
            return true;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int food){
        this.food = this.food + food;
    }


}
