/*
    Have the function SimpleAdding(num) add up all the   
    numbers from 1 to num. For the test cases, 
    the parameter num will be any number     
    from 1 to 1000.                       
 */

import java.util.*;
import java.io.*;

public class simpleAdding {
    public static int simpleAdd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find the sum: ");
        int inputNumber = s.nextInt();
        System.out.println(simpleAdd(inputNumber));
        s.close();

    }
}