package com.geekbrains;

public class Employee {
   public String fio;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getSalary() {
        System.out.println(salary);
    }

    public void getEmail() {
        System.out.println(email);
    }

    public void getFio() {
        System.out.println(fio);
    }

    public void getPhoneNumber() {
        System.out.println(phoneNumber);
    }

    public void getPosition() {
        System.out.println(position);
    }
}


