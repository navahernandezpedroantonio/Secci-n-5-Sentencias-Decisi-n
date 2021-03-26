//Pedro Antonio Nava Hernández Programación Avanzada 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.*;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {
    System.out.println("Eres mayor de 18");
       Scanner sc = new Scanner(System.in);  
           boolean bn = sc.nextBoolean();  
           if (bn == true) {  
               System.out.println("You are over 18");  
           } else if (bn == false) {  
               System.out.println("You are under 18");  
           }  
           sc.close();                 
     


}

       
    }

