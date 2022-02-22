package com.company;
import java.util.Scanner;

public class Test {
    int k;  //номер нужного студента
    int z;
    int num;//колличество студентов в группе
    public Test(int k) {
        Scanner console = new Scanner(System.in);
        this.k = k;
        System.out.println("Введите колличество студентов в группе:");
        int num = console.nextInt();
        System.out.println("Выполнение тестов");
        System.out.print("В групее ");
        System.out.print(num);
        System.out.println(" студентов.");
        System.out.println("Необходимо вывести отметку у указанного студента и сверить вывод с ожидаемым");
        if (k <= (num/4)){
            z = 2;}
        else if (k <= (num/2)){
            z = 3;}
        else if (k <= ((num/4)*3)){
            z = 4;}
        else{
            z = 5;}
        Performance Student = new Performance(k, num, z);
        System.out.println(z);
    }
}