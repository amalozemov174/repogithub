package com.geekbrains;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        ++count;
    }

    public void run(int distance) {
        if (0 <= distance && distance <= 500) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        }

        if (distance > 500) {
            System.out.println(this.name + " пробежал 500 м.");
        }

    }

    public void swim(int distance) {
        if (0 <= distance && distance <= 10) {
            System.out.println(this.name + " проплыл " + distance + " м.");
        }

        if (distance > 10) {
            System.out.println(this.name + " проплыл 10 м.");
        }

    }
}