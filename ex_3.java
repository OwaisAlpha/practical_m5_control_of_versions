/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author DELL
 */
public class ex_3 {

    public static void main(String[] args) {
//        3. Write a method that given a table of numbers passed as a parameter returns another table with the inverted values.
        int table[] = {10, 15, 89, 45, 68};
        System.out.println("The table: ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]+" ");
        }
        System.out.println("");
        table=invert_table(table);
        
        System.out.println("Result: ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]+" ");
        }
    }
public static int[] invert_table(int table_inv[]){
    System.out.println("welcome to inversion of the table.");
    int swap=0;
    for (int i = 0; i < table_inv.length/2; i++) {
        swap=table_inv[i];
        table_inv[i]=table_inv[table_inv.length-1-i];
        table_inv[table_inv.length-1-i]=swap;
        
    }
    return table_inv;
}
}
