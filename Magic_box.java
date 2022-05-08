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
public class Magic_box {
//    readDimensio: We ask the user to indicate the size N of the matrix. If the value is correct, the function returns it.
//    initializeSquare: Simply set all values ​​to 0
//    calculateInitialPosition: Depending on the dimension, we calculate the first position
//    assignAvalue: Sets a value to a position
//    calculateNewPosition: Returns the valid row and column values ​​to place the next value.
//    printSquare: Displays the magic square

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    Scanner lector = new Scanner(System.in);

    // method to get and return the Dimensions.
    public int get_dimension() {
        int dim;
        System.out.println("Please select the Odd_Dimensions Of the Box.");
        dim = lector.nextInt();
        while (dim < 2) {
            System.out.println("Enter a Value greater than 1.");
            dim = lector.nextInt();
        }
        while (dim % 2 == 0) {

            System.out.println("You entered even value or lesser than 2.Please enter the Odd and \"> 2\" Dimensions Of the Box.");

            //setting the size of box
            dim = lector.nextInt();

        }
        return dim;
    }

    //for setting the values to 0.
    public void inicializar_taula(int[][] table) { //setting the all values of a table 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 0;
            }
        }
//        return table;
    }

    // to get the inicial position.
    public int[] inicial_posicion(int length) {
        int pos = length / 2;
        int[] init_pos = {pos - 1, pos};
        return init_pos;
    }

    // assigning values.
    public int assign_values(int[] position, int value, int dim) {
        int temp_tab[][] = new int[dim][dim];
        temp_tab[position[0]][position[1]] = value;
        int val = temp_tab[position[0]][position[1]];
        return val;
    }

    // new position after assigning values.,
    public int[] next_position(int[][] table, int[] position) {
        int pos[] = position;

        pos[0] = pos[0] - 1;
        if (pos[0] < 0) {
            pos[0] = table.length - 1;
        }

        pos[1] = (pos[1] + 1);
//        pos[1]=pos[1]+1 %table.length;
        if (pos[1] >= table.length) {
            pos[1] = 0;
        }
        if (table[pos[0]][pos[1]] != 0) {
            pos[0] = pos[0] - 1;
            pos[1] = pos[1];
            if (pos[0] < 0) {
                pos[0] = table.length - 1;
            }
        }

        return pos;
    }

    public void display_box(int[][] box) {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box.length; j++) {
                if (box[i][j] % 2 == 0) {
                    System.out.printf(TEXT_GREEN + "%4d ", box[i][j]);
                } else {
                    System.out.printf(TEXT_RED + "%4d ", box[i][j]);
                }
            }
            System.out.println("");
        }

    }
}
