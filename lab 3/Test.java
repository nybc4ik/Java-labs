package com.company;

public class Test {
    int n;
    int [] myArray;
    int [] expectedArray;
    public Test() {
        System.out.println("На ввод поступает 5 чисел:");
        n = 5;
        myArray = new int [n];
        myArray[0] = 12345;
        myArray[1] = 111;
        myArray[2] = 112;
        myArray[3] = 123;
        myArray[4] = 1234;

        expectedArray = new int[n];
        expectedArray[0]=111;
        expectedArray[1]=112;
        expectedArray[2]=123;
        expectedArray[3]=1234;
        expectedArray[4]=12345;
        Numbers num = new Numbers(myArray, expectedArray);
    }
}
