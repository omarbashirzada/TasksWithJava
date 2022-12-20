/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divisible2;

/**
 *
 * @author User
 */
public class ReverseComparison {

    public static void reverseComp(String word) {
        String str = "";
        boolean a = true;
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            str = ch + str;
        }
        if (word.equals(str)) {
            a = true;
        } else {
            a = false;
        }
        System.out.println(a);
    }
}
