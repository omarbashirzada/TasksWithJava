/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divisible2;

/**
 *
 * @author User
 */
public class Disk {
    public static void Disk(int a,int b ){
        
        a+=b;
        b = a-b;
        a = a-b;
        
        System.out.println("Yerdeyismis 1: " +a+ " Yerdeyismis 2: "+b);
    }
}
