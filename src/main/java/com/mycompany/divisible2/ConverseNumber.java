/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divisible2;

/**
 *
 * @author User
 */
public class ConverseNumber {
    public static int ConverseNum(int num){
        int converse = 0;
        while(num>0){
            converse*=10;
            converse+=num%10;
            num = num/10;
        }
        
        if(converse == num){
            System.out.println("Equality is true");
        }else{
            System.out.println("False");
        }
        return converse;
                
    }
    
}
