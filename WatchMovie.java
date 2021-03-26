//Pedro Antonio Nava Hernández Programación Avanzada
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
            Scanner in= new Scanner(System.in);
        int precio=12;
        int rango=5;
        System.out.print("Introduce el precio de la película\n");
       precio=in.nextInt();
       System.out.print("Introduce el rango de la película");
       rango=in.nextInt();
       if(precio>=12 && rango ==5){
           System.out.println("Estoy interesado en ver la pelicula");
       }else{
           System.out.println("No estoy interesado en ver la pelicula");
       }
        
        

    }
}
