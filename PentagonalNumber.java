/*  The function PentagonalNumber(num) 
    read num which will be a positive integer and determine 
    how many dots exist in a pentagonal shape around a center 
    dot on the Nth iteration. 
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class PentagonalNumber{

    public static int getPentagonalNum(int input){
        int answer = 0;
        for (int n = input - 1; n > 0; n--) {
            answer = (n * 5 + answer);
        }
            answer +=1;
        
        return answer;

    }
    public static void main(String[] args) {
        System.out.println("Enter a positive integer to determine how many dots will exist in a pentgonal shape: ");
        Scanner s = new Scanner(System.in);
        System.out.println(getPentagonalNum(s.nextInt()));
        s.close();
        
    }
}