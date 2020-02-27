/*
    The function ExOh(str) take the str parameter   
    being passed and return the string true if 
    there is an equal number of x's and o's, otherwise 
    return the string false. Only these two letters will 
    be entered in the string, no punctuation or numbers. 
    For example: if str is "xooxxxxooxo" then the output 
    should return false because there are 6 x's and 5 o's. 
 */

import java.util.*;
import java.lang.String;

public class exOh {
    public static boolean exOh(String str) {

        boolean result = false;
        if (str.length() % 2 == 1) {
            result = false;
        }

        int x_total = 0;
        int y_total = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                x_total++;
            } else if (str.charAt(i) == 'x') {
                y_total++;
            }
        }

        if (x_total == y_total) {
            result = true;
        }

        else if (x_total != y_total) {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string to determine if there is an equal number of x's and o's: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Result: " + exOh(s.nextLine()));
        s.close();

    }
}