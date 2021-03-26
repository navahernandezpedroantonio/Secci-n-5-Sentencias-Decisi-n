//Pedro Antonio Nava Hernández Programación Avanzada 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
  public static void main(String args []){
      
      Scanner entrada = new Scanner(System.in);
      String nombre= "Baphy", nombredos= "Baphy";
      System.out.println("Cual es tu nombre");
      nombre=entrada.nextLine();
     if(nombre.equals(nombre)){
         System.out.println("Rey del ska");
         
     }
     else{
         System.out.println("No eres bienvenido");
     }
  }

  

      
  
 

   
    }

