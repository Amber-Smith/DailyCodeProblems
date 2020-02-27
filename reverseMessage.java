/*  Write a function FirstReverse(str) take
    the str parameter being passed and 
    return the string in reversed order. 
    For example: if the input string is "Hello World 
    and Coders" then your program should
    return the string sredoC dna dlroW olleH.*/

import java.util.*;
import java.io.*;
import java.lang.StringBuilder;

public class reverseMessage{
    public static String ReverseMessage(String str){
       str = new StringBuilder(str).reverse().toString();
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Enter your message to reverse: ");
        Scanner s = new Scanner(System.in);
        System.out.println(ReverseMessage(s.nextLine())); 
        s.close();
        
    }
}