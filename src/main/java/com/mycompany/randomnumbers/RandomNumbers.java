/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomnumbers;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class RandomNumbers{

    public static void main(String[] args) {
        Scanner InDate = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=InDate.nextInt();
  
        System.out.println("Enter second number");
        int num2=InDate.nextInt();
  
        for (int i=0;i<10;i++){
            //Generate random numbers
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }
    }
}
