/*
    The function CheckNums(num1,num2) take both 
    parameters being passed and return the string true if num2 is greater t
    han num1, otherwise return the string false. If the parameter values are e
    qual to each other then return the string -1. 
. 
 */

import java.util.*;
import java.lang.String;

public class checkNums {
    public static String checkNums(int num1, int num2) {

        String result;
        if (num1 == num2) {
            result = "-1";
        }

        if (num2 > num1) {
            result = "true";
        } else {
            result = "false";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in);
        int inputNumber = s.nextInt();
        int inputNumber2 = s.nextInt();
        System.out.println(checkNums(inputNumber, inputNumber2));
        s.close();

    }
}