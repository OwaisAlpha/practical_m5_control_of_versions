/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author mowais.daw1r
 */
public class ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //. Escriu un programa que donat un vector numèric (de qualsevol mida) amb valors no negatius, 
        //permeti fer les següents opcions (cada opció serà un mètode):
//        retornar el valor màxim del vector.
//        retornar el valor mínim del vector.
        Scanner lector = new Scanner(System.in);
        int size = 0;
        System.out.println("Plaese enter the size of the Table.");
        size = lector.nextInt();
        int[] taula = new int[size];

        for (int i = 0; i < taula.length; i++) {
            System.out.println("Enter the value for position " + (i + 1) + ": ");
            taula[i] = lector.nextInt();
        }
        for (int i = 0; i < taula.length; i++) {
            System.out.print(taula[i] + " ");

        }
        System.out.println("");
        int max = max_value(taula);
        int min = min_value(taula);
        
        System.out.println("The Maximum Value of Table is: " + max);
        System.out.println("The Minimum Value of Table is: " + min);
    }

    public static int max_value(int table[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < table.length; i++) {
            if (maximum < table[i]) {
                maximum = table[i];
            }
        }
        return maximum;
    }

    public static int min_value(int table[]) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < table.length; i++) {
            if (minimum > table[i]) {
                minimum = table[i];
            }
        }
        return minimum;
    }

}
