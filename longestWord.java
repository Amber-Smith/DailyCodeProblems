/* The function LongestWord(sen) take the sen      
   parameter being passed and return the largest 
   word in  the string. If there are     
   two or more words that are the same length,  
   return the first word from the string  
   with that length. Ignore punctuation and 
   assume sen will not be empty.
*/

import java.util.*;

public class longestWord{  
  public static String LongestWord(String sen) {
        String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return words[maxIndex];
    }
  
  public static void main (String[] args) {  
    System.out.println("Enter a message to find the longest word: ");
    Scanner s = new Scanner(System.in);
    System.out.println(LongestWord(s.nextLine())); 
    s.close();
  }   
  
}
