package com.company;
import java.util.Scanner;

public class Main {
    private static int number;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер студента");
        int number = console.nextInt();
        Test exm = new Test(number);
    }
}
