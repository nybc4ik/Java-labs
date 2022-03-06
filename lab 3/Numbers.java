package com.company;
import java.util.HashSet;
import java.util.Scanner;

public class Numbers {
    int[][] Big_array;
    int a;
    int b;
    int c;
    int d;
    int f;
    int size;
    volatile boolean checkMark;

    public Numbers(int[] ArrayNum) {

        Scanner console = new Scanner(System.in);
        if ((ArrayNum.length) == 0) {
            System.out.println("Введите колличество чисел:");
            int c = console.nextInt();
            ArrayNum = new int[c];
            System.out.println("Введите числа:");
            for (int i = 0; i < c; i++) {
                ArrayNum[i] = console.nextInt();
            }
        }
        c = ArrayNum.length;
        Big_array = new int[2][c];
        for (int o = 0; o < c; o++) {
            Big_array[0][o] = ArrayNum[o];
        }
        //ArrayNum - массив с числами
        for (int k = 0; k < c; k++) {   //фиксирование числа
            b = ArrayNum[k];
            HashSet<Integer> set = new HashSet<Integer>();
            while (b != 0) {     //подсчёт колличества цифр числа
                a = b % 10;
                set.add(a);
                b = b / 10;
            }
            size = set.size();
            Big_array[1][k] = size;
        }
        //Вывод чисел до сортировки
        for (int m = 0; m < c; m++) {
            //System.out.println(Big_array[0][m]);
            System.out.println(Big_array[1][m]);
        }
        checkMark = false;

        //сортировка пузырьком
        while (!checkMark) {
            checkMark = true;
            for (int i = 0; i < c - 1; i++) {
                if (Big_array[1][i] > Big_array[1][i + 1]) {
                    checkMark = false;
                    d = Big_array[1][i];
                    Big_array[1][i] = Big_array[1][i + 1];
                    Big_array[1][i + 1] = d;
                    f = Big_array[0][i];
                    Big_array[0][i] = Big_array[0][i + 1];
                    Big_array[0][i + 1] = f;
                }
            }
        }
        System.out.println("Вывод чисел в порядке основаном на колличестве различных цифр в десятичном представлении");
        for (int m = 0; m < c; m++) {
            System.out.println(Big_array[0][m]);
            //System.out.println(Big_array[1][m]);
        }
    }
}
