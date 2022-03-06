package com.company;
import java.util.Scanner;

public class Main {
    static int a;
    static int [] Arr;

    public static void main(String[] args) {
        Arr = new int [0];
        System.out.println("Выберети метод работы программы тестрование(0) или ручной ввод(1) ");
        Scanner console = new Scanner(System.in);
        a = console.nextInt();
        if (a == 0) {
            System.out.println("Запуск тестов");
            Test exm = new Test();}
        else {
            System.out.println("Введите данные");
            Numbers num = new Numbers(Arr);
        }
    }
}
