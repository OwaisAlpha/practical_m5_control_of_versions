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
public class Characteres {

    final String missatgeEntrada = "Inútil, introdueix un valor entre 1 i 9";
    final String missatgeNumero = "Has d'introduir un valor numèric";

    public  int show_menu() {

        final String menu
                = "1.Show the first n characters of a string\n"
                + "2.Show last n characters in a string (left to right)\n"
                + "3.Remove whitespace at the end of the string\n"
                + "4.Remove whitespace at the beginning of the string\n"
                + "5.Remove the n characters that appear from position p from a string.\n"
                + "6.Insert one string into another from position p.\n"
                + "7.Count the number of times one string appears inside another\n"
                + "8. Delete all occurrences of one string within another\n"
                + "9. Sortir\n"
                + "Tria una opció: ";
        System.out.println(menu);
        Scanner lector = new Scanner(System.in);
        int opcio = lector.nextInt();
        return opcio;
    }

}
