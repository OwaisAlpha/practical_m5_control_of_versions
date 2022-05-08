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
public class ex_2 {

    public static void main(String[] args) {
//        2. Fes un mètode que donat un número passat com a paràmetre que representi 
//                el dia de la setmana retorni un String amb el nom d'aquest dia 
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Please enter the Number TO se the day of Week.Fromm 1 to 7.");
        int num = lector.nextInt();

        while (num >= 7 ||num<=0) {
            System.out.println("you entered a number out of range.please enter a number from 1 to 7.");
            num = lector.nextInt();
        }

        String day = week_days(num);
        System.out.println("The nUmber you Entered is " + num + ".");
        System.out.println("The day is : " + day);
    }

    public static String week_days(int day) {

        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        return week[day-1];
    }
}
