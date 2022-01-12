package com.geekbrains;

public class CheckHomeWork {
    public CheckHomeWork() {
    }

    public static void main(String[] args) {
        Animal Cat = new Cat("Кот");
        Animal Dog = new Dog("Пес");
        System.out.println("Создано животных: " + Animal.count);

        for(int i = 10; i < 600; i += 50) {
            Cat.run(i);
            Cat.swim(i);
            Dog.run(i);
            Dog.swim(i);
        }

    }
}
