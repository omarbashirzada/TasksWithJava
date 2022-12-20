/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.divisible2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Divisible2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DivisibleTwo(n);//Printing numbers that are divisible by two
        
        PrimeNumber(n);//Printing number that are prime numbers
        
        int num1 = sc.nextInt();
        DigitSum.SumDigitNumber(num1);//the sum of the digits of the given number
        
        Disk.Disk(10, 12);//displacement
        
        int num2 = sc.nextInt();
        DigitNumFind.DigitNum(num2);
        
        int num3 = sc.nextInt();
        Factorial.factorial(num3);//Factorial
        
        System.out.println("Factorial with recursion: " + Factorial.factorialWithRecursion(num3));//Factorial with recursion
        
        ReverseComparison.reverseComp("ASDD");
        
        int num4 = sc.nextInt();
        ConverseNumber.ConverseNum(num4);
        
        
    }

    public static void DivisibleTwo(int num) {
        ArrayList<Integer> arrayList;
        arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++) {

            if (i % 2 == 0) {
                arrayList.add(i);

            }
        }
        System.out.println("subtracting numbers that are divisible by two: " + arrayList);
    }

    public static void PrimeNumber(int num) {
        ArrayList<Integer> arrayList;
        arrayList = new ArrayList<>();
        int j = 0;
        int counter = 0;

        for (j = 1; j < num; j++) {
            counter = 0;
            for (int i = 1; i <= num; i++) {

                if (j % i == 0) {
                    counter++;
                }

            }

            if (counter == 2) {
                arrayList.add(j);
            }
        }

        System.out.println("Prime number: " + arrayList);

    }
}
