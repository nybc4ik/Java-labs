package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Performance {
    int students;   //колличество учеников
    int student;    // номер студента
    int [] myArray; // массив для отметок
    int mark;       // ожидаемая отметка

    public Performance(int student, int students, int mark) {
        Scanner console = new Scanner(System.in);

        this.students = students; // колличество студентов в группе
        this.student = student;   // номер нужного студента
        this.mark = mark;         // ожидаемая отметка

        System.out.println("Введите баллы студентов:");
        myArray = new int[students];          // обозначенние колличества элементов в массиве
        for(int i = 0; i < students; i++) {
            int b = console.nextInt();        //баллы студента
            myArray[i]= b;}                   //заполнение ячеек массива данными о студентах

        int balls = myArray[this.student-1];  // ввод баллов студента в отдельную переменную

        Arrays.sort(myArray);                          //сортировка массива
        int key = Arrays.binarySearch(myArray, balls); //поиск индекса элемента в массиве

        if (key < (students/4)){                       //вывод искомой отметки студента
            System.out.println("Отметка 2");
            if (this.mark == 2){
                System.out.println("Success");}
            else{
                System.out.println("Fail");}}
        else if(key < (students/2)){
            System.out.println("Отметка 3");
            if (this.mark == 3){
                System.out.println("Success");}
            else{
                System.out.println("Fail");}}
        else if(key < ((students/4)*3)){
            System.out.println("Отметка 4");
            if (this.mark == 4){
                System.out.println("Success");}
            else{
                System.out.println("Fail");}}
        else{
            System.out.println("Отметка 5");
            if (this.mark == 5){
                System.out.println("Success");}
            else{
                System.out.println("Fail");}}
    }
}
