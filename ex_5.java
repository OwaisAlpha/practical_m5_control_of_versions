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
public class ex_5 {
//            5. Create a character class that performs the 8 points required in exercise 10 of strings. 
//            There must be a method for each problem.
//            Under no circumstances will the method ask the user for data or print anything on the console.
//            Everything has to be done through parameters.
//            It is also necessary to make a program in another file that by means of a menu allows to execute this method.

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Characteres chr = new Characteres();
        String text = "";
        int num = 0;
        String result = "";
        int option = chr.show_menu();

        if (option >= 1 && option <= 9) {
            switch (option) {
                case 1:
//                    "1.Show the first n characters of a string\n"
                    System.out.println("Please Enter a Text.");
                    text = lector.nextLine();
                    System.out.println("Please Enter the Number of Characters you want to see.");
                    num = lector.nextInt();
                    result = method_1(text, num);
                    System.out.println("result: " + result);

                    break;
                case 2:
//                  2.Show last n characters in a string (left to right)
                    System.out.println("Please Enter a Text.");
                    text = lector.nextLine();
                    System.out.println("Please Enter the Number of Characters you want to see from the end of text.");
                    num = lector.nextInt();

                    result = method_2(text, num);
                    System.out.println("result: " + result);
                    break;
                case 3:
//                      3.Remove whitespace at the end of the string\n 
                    System.out.println("Please Enter a Text.");
                    text = lector.nextLine();
//                    System.out.println("Please Enter the Character you want to remove from the text.");
//                     char replace = lector.next().charAt(0);
                    result = method_3(text);
                    System.out.println("result: " + result);

                    break;
                case 4:
//        "4.Remove whitespace at the beginning of the string\n" 
                    System.out.println("Enter the text.");
                    text = lector.nextLine();
                    System.out.println("The text you entered is following.");
                    System.out.println(text + "\n the length of text is " + text.length());
                    result = method_4(text);
                    System.out.println("text after removing the whitw spaces form the start:\n" + result);

                    break;
                case 5:
//                     + "5.Remove the n characters that appear from position p from a string.\n"
                    System.out.println("Enter the text.");
                    text = lector.nextLine();
                    System.out.println("enter the Number");
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        } else {
            System.out.println(chr.missatgeEntrada);
        }
    }

    public static String method_1(String text, int num) {
        text = text.substring(0, num);
        return text;
    }

    public static String method_2(String text, int num) {
//        2.Show last n characters in a string (left to right)
        String res = "";
        int start_index = text.length() - num;
        for (int i = start_index; i < text.length(); i++) {
            res += (text.charAt(i));
        }

        return res;
    }

    public static String method_3(String text) {
//        3.Remove whitespace at the end of the string\n
        text = text.replaceAll(" ", "");

        return text;
    }

    public static String method_4(String text) {
//        "4.Remove whitespace at the beginning of the string\n"
        int length = 0;
        while (Character.isWhitespace(text.charAt(length))) {
            length++;
        }
        text = text.substring(length, text.length());

        return text;
    }

    public static String method_5(String text, int num, int pos) {
//        + "5.Remove the n characters that appear from position p from a string.\n"

        return text;
    }

    public static String method_6(String text, int num) {
//          + "6.Insert one string into another from position p.\n"
        return text;
    }

    public static String method_7(String text, int num) {
//         + "7.Count the number of times one string appears inside another\n"
        return text;
    }

    public static String method_8(String text, int num) {
//        + "8. Delete all occurrences of one string within another\n"
        return text;
    }

}
