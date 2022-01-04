package com.geekbrains;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class lesson4 {
    public static int gameFieldSize;
    public static char[][] gameField;
    public static char gameCell = '.';
    public static char gameCross = 'X';
    public static char gameZero = 'O';
    public static boolean whosTurn = true;
    public static boolean RunGame = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите размер игрового поля(можно выбрать 3 или 5):");
        gameFieldSize = Integer.parseInt(br.readLine());

        gameField = inicializeGameField(gameFieldSize);

        //Определяем очередность хода
        if((Math.random() * 10 >= 5)){
            computerMakeStep();
            whosTurn = true;
        }
        else{
            humanMakeStep();
            whosTurn = false;
        }

        while(RunGame){
            if(whosTurn){
                humanMakeStep();
                if(isMapFull()){
                    System.out.println("ничья");
                    break;
                }
                if(CheckWinOrEndGame()){
                    break;
                }
                whosTurn = false;
            }
            else{
                computerMakeStep();
                if(isMapFull()){
                    System.out.println("ничья");
                    break;
                }
                if(CheckWinOrEndGame()){
                    break;
                }
                whosTurn = true;
            }
        }
    }

    public static void printGameField() {
        for (int i = 0; i < gameFieldSize; i++){
            for (int j = 0; j < gameFieldSize; j++){
                System.out.print(gameField[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < gameFieldSize; i++) {
            for (int j = 0; j < gameFieldSize; j++) {
                if (gameField[i][j] == gameCell) return false;
            }
        }
        return true;
    }



    public static boolean CheckWinOrEndGame() {
        int maxElements = 0;

        if(gameFieldSize == 3){
            maxElements = 3;
        }
        else if(gameFieldSize == 5){
            maxElements = 4;
        }

        ArrayList<Point> p_X = new ArrayList<Point>();
        ArrayList<Point> p_O = new ArrayList<Point>();

        for (int i = 0; i < gameFieldSize; i++){
            for(int j = 0; j < gameFieldSize; j++){
                if(gameField[i][j] == gameCross){
                    p_X.add(new Point(i,j));
                }
                else if(gameField[i][j] == gameZero){
                    p_O.add(new Point(i,j));
                }
            }
        }
        //Проверяем прямые линии по оси X и по оси Y для пользователя
        int tmpX = p_X.get(0).x;
        int tmpY = p_X.get(0).y;
        int countX = 0;
        int countY = 0;
        for(Point p : p_X){
            if(p.x == tmpX){
                countX++;
                if (countX == maxElements){
                    System.out.println("Победил пользователь");
                        return true;
                    }
                }
            if(p.y == tmpY){
                countY++;
                if (countY == maxElements){
                    System.out.println("Победил пользователь");
                        return true;
                    }
                }
            }

        // Проверяем прямую диагональ для пользователя
        int countDiag = 0;
        for(Point p : p_X){
            if(p.x == p.y){
                countDiag++;
                if (countDiag == maxElements){
                    System.out.println("Победил пользователь");
                    return true;
                }
            }
        }
        //Проверяем обратную диагональ для пользователя
        int [] imass = new int[p_X.size()];
        int [] jmass = new int[p_X.size()];

        for (int i = 0; i < p_X.size(); i++){
            imass[i] = p_X.get(i).x;
            jmass[i] = p_X.get(i).y;
        }

        Arrays.sort(imass);
        Arrays.sort(jmass);
        int countReverse = 0;

        for(int i = 0; i < p_X.size(); i++){
            if( i == p_X.size() - 1){
                continue;
            }
            if(imass[i] + 1 == (imass[i + 1]) && jmass[i] + 1 == (jmass[i + 1])){
                countReverse++;

                if (countReverse == maxElements - 1){
                    System.out.println("Победил пользователь");
                    return true;
                }
            }
        }

        //Проверяем прямые линии по оси X и по оси Y для компьютера
        tmpX = p_O.get(0).x;
        tmpY = p_O.get(0).y;
        countX = 0;
        countY = 0;
        for(Point p : p_O){
                if(p.x == tmpX){
                    countX++;
                    if (countX == maxElements){
                        System.out.println("Победил компьютер");
                        return true;
                    }
                }
                if(p.y == tmpY){
                    countY++;
                    if (countY == maxElements){
                        System.out.println("Победил компьютер");
                        return true;
                    }
                }
        }
        // Проверяем прямую диагональ для компьютера
        countDiag = 0;
        for(Point p : p_X){
            if(p.x == p.y){
                countDiag++;
                if (countDiag == maxElements){
                    System.out.println("Победил компьютер");
                    return true;
                }
            }
        }
        //Проверяем обратную диагональ для пользователя
        imass = new int[p_O.size()];
        jmass = new int[p_O.size()];

        for (int i = 0; i < p_O.size(); i++){
            imass[i] = p_O.get(i).x;
            jmass[i] = p_O.get(i).y;
        }

        Arrays.sort(imass);
        Arrays.sort(jmass);
        countReverse = 0;

        for(int i = 0; i < p_O.size(); i++){
            if( i == p_O.size() - 1){
                continue;
            }
            if(imass[i] + 1 == (imass[i + 1]) && jmass[i] + 1 == (jmass[i + 1])){
                countReverse++;

                if (countReverse == maxElements - 1){
                    System.out.println("Победил пользователь");
                    return true;
                }
            }
        }


        return false;
    }

    public static void humanMakeStep() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите номер поля в формате i,j:");
        int [] checkValues = new int[2];
        do{
            String s1 = br.readLine();
            String[] str = s1.split(",");
            checkValues[0] = Integer.parseInt(str[0]) - 1;
            checkValues[1] = Integer.parseInt(str[1]) - 1;
        }while (!isCorrectValue(checkValues));

        //if(isCorrectValue(checkValues)){
            gameField[checkValues[0] ] [checkValues[1]] = gameCross;
        //}
        //else {

        //}

        printGameField();

    }

    public static boolean isCorrectValue(int[] check){
        if(check[0] >= 0 && check[0] <= gameFieldSize || check[1] >= 0 && check[1] <= gameFieldSize){
            if(gameField [check[0]][check[1]] != gameCell){
                System.out.println("Ошибка ввода попробуйте еще раз");
                return false;
            }
            return true;
        }
        System.out.println("Ошибка ввода попробуйте еще раз");
        return false;
    }

    public static void computerMakeStep() {
        Random rnd = new Random();
        int x,y;
        int[] tmp = new int[2];

        do{
            x = rnd.nextInt(gameFieldSize);
            y = rnd.nextInt(gameFieldSize);
            tmp[0] = x;
            tmp[1] = y;

        }while (!isCorrectValue(tmp));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        gameField[x][y] = gameZero;
        printGameField();
    }

    public static char [][] inicializeGameField(int gameFieldSize) {
        char[][] _gameField = new char[gameFieldSize][gameFieldSize];

        for (int i = 0; i < gameFieldSize; i++){
            for (int j = 0; j < gameFieldSize; j++){
                _gameField[i][j] = gameCell;
                System.out.print(_gameField[i][j] + " ");
            }
            System.out.print("\n");
        }

        return _gameField;
    }
}
