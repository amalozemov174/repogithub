package com.geekbrains;

public class Main {

    public static void main(String[] args){
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Engineer", "ppetrov@mailbox.com", "893312312",30000, 35);
        persArray[2] = new Employee("Sidorov Ivan", "Engineer", "isidorov@mailbox.com", "892412312",30000, 40);
        persArray[3] = new Employee("Yachmenev Ivan", "Engineer", "iyachmenev@mailbox.com", "895312312",30000, 41);
        persArray[4] = new Employee("Tsvetkov Ivan", "Engineer", "itsvetkov@mailbox.com", "866662312312",30000, 42);

        for(Employee e : persArray){
            if(e.age >= 40){
                e.getFio();
            }
        }
    }
}
