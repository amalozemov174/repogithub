package com.geekbrains;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        ++count;
    }

    public void run(int distance) {
        if (0 <= distance && distance <= 200) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        }

        if (distance > 200) {
            System.out.println(this.name + " пробежал 200 м.");
        }

    }

    public void swim(int distance) {
        System.out.println("кот не умеет плавать");
    }
}