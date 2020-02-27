/*  The function LetterCapitalize(str) take the     
    str parameter being passed and capitalize 
    the first letter of each word. Words will be 
    separated by only one space.   */


import java.util.*;

public class letterCapitalize{
    public static String getCapitalize(String message, Scanner lineScan){

        String newmessage = "";
        while(lineScan.hasNext()){
            String word = lineScan.next();
            newmessage +=Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";        
        }

        return newmessage.trim();
    }
    public static void main(String[] args) {
        System.out.println("Enter your message to capitalize" + 
                            " the first letter of each word:");
        Scanner s = new Scanner(System.in);
        String inputMessage = s.nextLine();
        Scanner lineScan = new Scanner(inputMessage);
        System.out.println(getCapitalize(inputMessage, lineScan));
        s.close();
    }
}