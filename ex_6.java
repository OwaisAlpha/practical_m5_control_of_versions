/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author mowais.daw1r
 */
public class ex_6 {

    public static void main(String[] args) {
        // magic box.
        int dimensiones;//variable para tener los dimensiones vienen del methodo.

        Magic_box obj = new Magic_box(); //creating an object to acces the methods of a class.
        dimensiones = obj.get_dimension(); //variable to get the Dimensiones f the box.

        int qm[][] = new int[dimensiones][dimensiones]; //Creation of magic box.

        int limit = qm.length * qm.length; //as magic box has to be quadratic so rows and columns willl be same-

        obj.inicializar_taula(qm); //Setting all the position of Box "0".

       
        obj.display_box(qm);
        

        int[] position = obj.inicial_posicion(qm.length); // getting the starting position.

        for (int value = 1; value <= limit; value++) { // loop to assign values, get new positions.

            qm[position[0]][position[1]] = obj.assign_values(position, value, dimensiones); // values assignment.
            int test = ((position[1] + 1) % qm.length);

            position = obj.next_position(qm, position); // next position

        }

        //Printing the initialised table.
        obj.display_box(qm);

    }

}
