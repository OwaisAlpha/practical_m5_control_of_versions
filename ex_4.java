/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ex_4 {

    public static void main(String[] args) {
//        4. Escriu un mètode per realitzar l'exercici 13 dels "exercicis amb for".
//          EL nombre de línies serà el paràmetre del mètode
        Scanner lector = new Scanner(System.in);
        System.out.println("Enter the length.");
              int length=lector.nextInt();
              System.out.println("Enter the character you waant to print.");
              char shape=lector.next().charAt(0);
              
              //calling the method.
              print_shapes(length,shape);
              
        
    }
    public static void print_shapes(int length,char shape){
        
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(shape+" ");
            }
            System.out.println("");
        }
        
    }

}
