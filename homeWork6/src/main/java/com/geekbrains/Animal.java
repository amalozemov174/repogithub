package com.geekbrains;

public abstract class Animal {
    static int count = 0;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int var1);

    public abstract void swim(int var1);
}