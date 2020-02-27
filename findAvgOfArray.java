
// Write a Java program to calculate the average value of array elements
import java.util.*;

public class findAvgOfArray {
    public static void main(String[] args) {

        int size;
        Scanner count = new Scanner(System.in);
        System.out.println("Enter the count of numbers you will find the average of: ");
        size = count.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter numbers you would like to find the average of: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = count.nextInt();
        }

        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / size;

        System.out.println("Average: " + average);

        count.close();

    }
}