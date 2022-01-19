package com.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {


    public static void main(String[] args){
        int res;
        final ArrayList<String> calc = new ArrayList<String>();

        Main maimForm = new Main();
        maimForm.setTitle("Калькулятор");
        maimForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        maimForm.setBounds(300, 300, 400, 400);
        maimForm.setLayout(null);

         final Label monitor = new Label();

        monitor.setBounds(20, 20, 360, 40);
        monitor.setBackground(new Color(255,255,255,255));
        maimForm.add(monitor);

        JButton number1 = new JButton("1");
        number1.setBounds(20, 60, 120, 32);
        maimForm.add(number1);

        number1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("1");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number2 = new JButton("2");
        number2.setBounds(140, 60, 120, 32);
        maimForm.add(number2);

        number2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("2");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number3 = new JButton("3");
        number3.setBounds(260, 60, 120, 32);
        maimForm.add(number3);

        number3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("3");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number4 = new JButton("4");
        number4.setBounds(20, 92, 120, 32);
        maimForm.add(number4);

        number4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("4");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number5 = new JButton("5");
        number5.setBounds(140, 92, 120, 32);
        maimForm.add(number5);

        number5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("5");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number6 = new JButton("6");
        number6.setBounds(260, 92, 120, 32);
        maimForm.add(number6);

        number6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("6");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number7 = new JButton("7");
        number7.setBounds(20, 124, 120, 32);
        maimForm.add(number7);

        number7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("7");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number8 = new JButton("8");
        number8.setBounds(140, 124, 120, 32);
        maimForm.add(number8);

        number8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("8");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number9 = new JButton("9");
        number9.setBounds(260, 124, 120, 32);
        maimForm.add(number9);

        number9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("9");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton number0 = new JButton("0");
        number0.setBounds(20, 156, 120, 32);
        maimForm.add(number0);

        number0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add("0");
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton numberPlus = new JButton("+");
        numberPlus.setBounds(140, 156, 120, 32);
        maimForm.add(numberPlus);

        numberPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(calc.contains(" + ") || calc.contains(" - ") || calc.contains(" * ")){
                    // ничего не делаем
                }
                else{
                    calc.add(" + ");
                }
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton numberMinus = new JButton("-");
        numberMinus.setBounds(260, 156, 120, 32);
        maimForm.add(numberMinus);

        numberMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(calc.contains(" + ") || calc.contains(" - ") || calc.contains(" * ")){
                    // ничего не делаем
                }
                else{
                    calc.add(" - ");
                }
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton numberMultiplay = new JButton("*");
        numberMultiplay.setBounds(20, 188, 120, 32);
        maimForm.add(numberMultiplay);

        numberMultiplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(calc.contains(" + ") || calc.contains(" - ") || calc.contains(" * ")){
                    // ничего не делаем
                }
                else{
                    calc.add(" * ");
                }
                String tmp = "";
                for (String s : calc){
                    tmp += s;
                }
                monitor.setText(tmp);

            }
        });

        JButton numberEquals = new JButton("=");
        numberEquals.setBounds(140, 188, 120, 32);
        maimForm.add(numberEquals);

        numberEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNumber = 0;
                int secondNumber;
                int res = 0;
                String tmp = "";
                boolean isPlus = false;
                boolean isMinus = false;
                boolean isMultiplay = false;

                for (String s : calc){
                    if(s.equals(" + ")){
                        isPlus = true;
                        firstNumber = Integer.parseInt(tmp);
                        tmp = "";
                    }
                    else if(s.equals(" - ")){
                        isMinus = true;
                        firstNumber = Integer.parseInt(tmp);
                        tmp = "";
                    }
                    else if(s.equals(" * ")){
                        isMultiplay = true;
                        firstNumber = Integer.parseInt(tmp);
                        tmp = "";
                    }
                    else {
                        tmp = tmp + s;
                    }
                }

                secondNumber = Integer.parseInt(tmp);

                if(isPlus){
                    res = firstNumber + secondNumber;
                }
                if(isMinus){
                    res = firstNumber - secondNumber;
                }
                if(isMultiplay){
                    res = firstNumber * secondNumber;
                }
                monitor.setText(String.valueOf(res));
                calc.removeAll(calc);
                calc.add(String.valueOf(res));

            }
        });

        JButton numberClean = new JButton("C");
        numberClean.setBounds(260, 188, 120, 32);
        numberClean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.removeAll(calc);
                monitor.setText("");
            }
        });
        maimForm.add(numberClean);
        maimForm.setVisible(true);

    }


}
