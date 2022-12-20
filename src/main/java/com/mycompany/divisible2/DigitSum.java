/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divisible2;

/**
 *
 * @author User
 */
public class DigitSum {
    public static void SumDigitNumber(int num){
        int n = 0;
        int sum = 0 ; 
        int i = 0;
        while(num >0){
            n = num%10;
            sum+=n;
            num = num/10;
            i++;
        }
        System.out.println(sum);
            
        
    }
    
}
