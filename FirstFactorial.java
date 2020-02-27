
/*  Have the function FirstFactorial(num) 
    take the num parameter being passed 
    and return the factorial of it. 
    For example: if num = 4, then your
    program should return (4 * 3 * 2 * 1) = 24. 
    For the test cases, the range will be between 
    1 and 18 and the input will always be an 
    integer. 
*/

import java.util.*;

public class FirstFactorial {
    public static int getFactorial(int num) {
        int product = 1;
        for (int i = num; i >= 1; i--) {
            product = product * i;
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int inputNumber = s.nextInt();
        System.out.println("Result: " + getFactorial(inputNumber));
        s.close();

    }
}