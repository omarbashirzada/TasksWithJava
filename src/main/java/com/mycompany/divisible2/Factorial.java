/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divisible2;

/**
 *
 * @author User
 */
public class Factorial {

    public static void factorial(int num) {
        int hasil = 1;
        for (int i = 1; i <= num; i++) {
            hasil *= i;
        }
        System.out.println("Factorial: " + hasil);
    }

    public static int factorialWithRecursion(int num) {
        if(num == 0){
            return 1;
       }else{
            return (num*factorialWithRecursion(num-1));
        }

    }

}
