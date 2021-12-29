
import java.lang.reflect.Field;
import java.util.Arrays;

public class homeWork3 {
    public static void main(String[] args){
        //Задание 1
        int[] binMass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < binMass.length; i++){
            if(binMass[i] == 1){
                binMass[i] = 0;
            }
            else {
                binMass[i] = 1;
            }
        }
        //System.out.println(Arrays.toString(binMass));

        //Задание 2
        int [] oneHundredNumbers = new int[100];
        for(int i = 0; i < oneHundredNumbers.length; i++){
            oneHundredNumbers[i] = i + 1;
        }
        //System.out.println(Arrays.toString(oneHundredNumbers));

        //Задание 3
        int [] multiplicationElements = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < multiplicationElements.length; i++){
            if(multiplicationElements[i] < 6){
                multiplicationElements[i] = multiplicationElements[i] * 2;
            }
        }
        //System.out.println(Arrays.toString(multiplicationElements));

        //Задание 4
        int [][] stars = new int[5][5];
        for (int i = 0; i < stars.length; i++){
            for (int j = 0; j < stars.length; j++){
                if (stars[i] == stars[j]){
                    System.out.print("1 ");
                }
                else if(j == stars.length - 1 - i ){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
        //Задание 5
        System.out.println(Arrays.toString(fillMass(7, 4)));

        //Задание 6
        int[] findValues = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arrays.sort(findValues);
        System.out.printf("Максимальное число %d\n", findValues[0]);
        System.out.printf("Минимальное число %d\n", findValues[findValues.length - 1]);

        //Задание 7
        int[] checkArray = {2, 2, 2, 1, 2, 2, 10, 1};
        //int[] checkArray = {1, 1};
        //int[] checkArray = {1, 1, 1, 2, 1};
        //int[] checkArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //int[] checkArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println(checkBalance(checkArray));

        //Задание 8
        //int[] move = {1,2,3};
        //int[] move = {1,2,3,4,5,6,7};
        int[] move = {3, 5, 6, 1};
        System.out.println(Arrays.toString(moveArray(move, -2)));

    }

    public static int[] fillMass(int len, int initialValue){
        int [] res = new int[len];
        for(int i = 0; i < res.length; i++){
            res[i] = initialValue;
        }
        return res;
    }

    public static boolean checkBalance(int[] checkBalance){
        int sumI = 0;
        int sumJ = 0;
        int i = 0;
        int j = checkBalance.length - 1;
        sumI += checkBalance[i];
        sumJ += checkBalance[j];
        while(true){
            if(i == (j - 1) && (i + 1) == j){
                if (sumI == sumJ){
                    return true;
                }
                else {
                    return false;

                }
            }
            if(sumI > sumJ){
                j--;
                sumJ += checkBalance[j];

            }
            else if(sumJ > sumI){
                i++;
                sumI += checkBalance[i];

            }
            else if (sumJ == sumI){
                j--;
                sumJ += checkBalance[j];
            }
        }
    }

    public static int[] moveArray(int[] unmovedMass, int shift){
        int[] _tmp = new int[unmovedMass.length];
        int n = shift;
        int newPosition = 0;
        //Положительный сдвиг
        if (n >= 0){
            for (int i = 0; i < unmovedMass.length; i++){
                newPosition = i;
                for(int j = 0; j < n; j++){
                    if((newPosition) == (unmovedMass.length - 1)){
                        newPosition = 0;
                    }
                    else {
                        newPosition++;
                    }
                }
                _tmp[newPosition] = unmovedMass[i];
            }
            return _tmp;
        }
        else{//Отрицательный сдвиг
            for (int i = unmovedMass.length - 1; i >= 0; i--){
                newPosition = i;
                for(int j = 0; j < Math.abs(n); j++){
                    if((newPosition) == 0){
                        newPosition = unmovedMass.length - 1;
                    }
                    else {
                        newPosition--;
                    }
                }
                _tmp[newPosition] = unmovedMass[i];
            }
            return _tmp;
        }

    }
}
