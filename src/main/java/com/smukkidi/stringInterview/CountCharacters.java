package com.smukkidi.stringInterview;
/**
 * Java program to count the number of occurrences of any character on String.
 */
public class CountCharacters {
    public static void main(String[] args) {
        String input = "Test Automation With Sreeni";
        // Count number of "e" on this String.

        int countChar = 0;
        // Using String common String utils
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'e'){
                countChar++;
            }
        }
        System.out.println("Using String utils :: "+countChar);

        int charCount = 0;
        // Using for loop
        for(char ch: input.toCharArray()){
            if(ch == 'e'){
                charCount++;
            }
        }
        System.out.println("Using for loop :: "+charCount);
    }

    
}
