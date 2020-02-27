/*  Given an array of integers, return a new array such that each 
    element at index i of the new array is the product of all the 
    numbers in the original array except the one at i. 
    For example, if our input was [1, 2, 3, 4, 5], 
    the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6]. */

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        int size;
        Scanner count = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:  ");
        size = count.nextInt();


        // new array for products
        int product[] = new int[size];

        int leftRange;

        int numbers[] = new int[size];

        System.out.println("Enter an array of numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = count.nextInt();
        }

        product[numbers.length - 1] = 1;
        for (int i = numbers.length - 2; i >= 0; i--) {
            product[i] = product[i + 1] * numbers[i + 1];
        }

        leftRange = 1;
        for (int i = 0; i < numbers.length; i++) {
            product[i] = product[i] * leftRange;
            leftRange = leftRange * numbers[i];
        }

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }

    }
}