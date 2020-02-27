/*  The function LetterChanges(str) take the str   
    parameter being passed and modify it using the following algorithm. 
    Replace every letter in the string with the letter following 
    it in the alphabet (ie. c becomes d, z becomes a). 
    Then capitalize every vowel in this new string (a, e, i, o, u) 
    and finally return this modified string. 
*/
import java.util.*;

public class letterChanges {

    public static String LetterChange(String sen){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] words = sen.toLowerCase().split("");
        String str = String.join("", words);
        String[] stringArray = str.split("");
        String newStr = "";
        int location = 0;

        for(int i = 0; i < str.length(); i++){
            location = alphabet.indexOf(stringArray[i]);
            if(location == 25){
                newStr = newStr+ "a";
            } else if (location == -1) {
                newStr = newStr + stringArray[i];
            }else {
                newStr = newStr + alphabet.charAt(location + 1);
            }

        }
        newStr = newStr.replaceAll("[a]","A");
        newStr = newStr.replaceAll("[e]","E");
        newStr = newStr.replaceAll("[i]","I");
        newStr = newStr.replaceAll("[o]","O");
        newStr = newStr.replaceAll("[u]","U");

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner s = new Scanner(System.in);
        System.out.println(LetterChange(s.nextLine()));
        s.close();

    }
}