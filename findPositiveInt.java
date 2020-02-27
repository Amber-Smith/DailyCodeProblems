/* Given an array of integers, find the first missing positive
integer. Find the lowest positive integer that does not exist
in the array. */

import java.util.*;

public class findPositiveInt {

    public static void main(String[] args) {
        int numbers[] = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 0;
        numbers[3] = 1;

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        int maxValueNegative = numbers[0];
        int maxValuePositive = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            int n = numbers[i];
            if (n >= 0) {
                positive.add(n);
            } else {
                negative.add(n);
            }

        } // end for

        int[] array = positive.stream().mapToInt(i -> i).toArray();
        int[] arrayN = negative.stream().mapToInt(i -> i).toArray();

        if (arrayN.length == 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxValuePositive) {
                    maxValuePositive = array[i];
                    System.out.println("The next positive int is:" + (maxValuePositive + 1));
                }
            }
        }
        if (arrayN.length != 0) {
            for (int i = 0; i < numbers.length; i++) {
                // System.out.println(numbers[i]);
                if (numbers[i] < maxValueNegative && numbers[i] >= 0) {
                    maxValueNegative = numbers[i];
                    System.out.println("The next positive int is: " + (maxValueNegative + 1));
                }
            }
        }

    }
}