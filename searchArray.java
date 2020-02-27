//  Write a Java program to test if an array 
// contains a specific value. 
//  Write a Java program to find the 
//  index of an array element.
import java.util.*;

public class searchArray{
    public static void main(String[] args) {
        
        int searchValue;
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the key you would like to search for in the array: ");
        searchValue = key.nextInt();
        
        int size;
        Scanner count = new Scanner(System.in);
        System.out.println("Enter the numbers of elements in the array: ");
        size = count.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter the values of the array:  ");
        for (int i = 0; i < size; i++) {
            numbers[i] = count.nextInt();
        }

    
        boolean isFound = true;
        int index = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == searchValue){
                isFound = true;
                index = i;
                break;
            } else{
                isFound = false;
            }
        }

        if (isFound == true){
            System.out.println("The specific value has been found: " + numbers[index] +
                " and it's index is: " + index);
        } else if(isFound == false){
            System.out.println("Value not found");

        }


        
    }
}