
/* 
  The function KaprekarsConstant(num) take the num parameter being 
  passed which will be a 4-digit number with at least two distinct 
  digits. Your program should perform the following routine on the 
  number: Arrange the digits in descending order and in ascending order 
  (adding zeroes to fit it to a 4-digit number), and subtract the smaller 
  number from the bigger number. Then repeat the previous step. Performing 
  this routine will always cause you to reach a fixed number: 6174. Then
   performing the routine on 6174 will always give you 6174 (7641 - 1467 = 
   6174). Your program should return the number of times this routine must 
   be performed until 6174 is reached. 
*/

import java.util.*;

public class KaprekarsConstant {

    static final int KAPREKARS_CONST = 6174;

    public static int findConstant(int input) {
        int finalAscending;
        int finalDscending;
        int value = 0;
        int counter = 1;

        int[] ascendingOrder = Integer.toString(input).chars().map(c -> c - '0').toArray();
        Arrays.sort(ascendingOrder);
        StringBuilder ascendingNum = new StringBuilder();
        for (int num : ascendingOrder) {
            ascendingNum.append(num);
        }

        reverseDescending(ascendingOrder);
        StringBuilder descedingNum = new StringBuilder();
        for (int nums : ascendingOrder) {
            descedingNum.append(nums);
        }

        finalDscending = Integer.parseInt(descedingNum.toString());
        finalAscending = Integer.parseInt(ascendingNum.toString());

        value = finalDscending - finalAscending;

        while (value != KAPREKARS_CONST) {

            if (String.valueOf(value).length() < 4) {
                value = Integer.valueOf(String.valueOf(value) + String.valueOf(0));
            }

            int[] ascOrder = Integer.toString(value).chars().map(c -> c - '0').toArray();
            Arrays.sort(ascOrder);
            StringBuilder ascNum = new StringBuilder();
            for (int num : ascOrder) {
                ascNum.append(num);
            }

            reverseDescending(ascOrder);
            StringBuilder desNum = new StringBuilder();
            for (int nums : ascOrder) {
                desNum.append(nums);
            }

            finalDscending = Integer.parseInt(desNum.toString());
            finalAscending = Integer.parseInt(ascNum.toString());

            value = finalDscending - finalAscending;

            counter++;

        }
        return counter;

    }

    public static void reverseDescending(int[] descendingOrder) {
        if (descendingOrder == null || descendingOrder.length <= 1) {
            return;
        }
        for (int i = 0; i < descendingOrder.length / 2; i++) {
            int temp = descendingOrder[i]; // swap numbers
            descendingOrder[i] = descendingOrder[descendingOrder.length - 1 - i];
            descendingOrder[i] = descendingOrder[descendingOrder.length - 1 - i];
            descendingOrder[descendingOrder.length - 1 - i] = temp;
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        System.out.println("Result: " + findConstant(s.nextInt()));
        s.close();

    }
}