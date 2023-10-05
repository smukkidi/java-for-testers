package com.smukkidi.stringInterview;

public class ReverseWords {
    // Reverse words in a sentence
    // Test Automation with Sreeni
    // Sreeni with Automation Test

    public static void main(String[] args) {
        String str = "Test Automation with Sreeni";

        String[] words = str.split(" ");
        
        System.out.println("\n \n Right order");
        for(int i =0; i < words.length; i++){
            System.out.print(words[i]+" ");
            
        }

        System.out.println("\n \n Reverse order with for loop");
        for(int j = words.length-1; j >= 0; j-- ){
            System.out.print(words[j]+" ");
        }
        
        System.out.println("\n \n With String builder.");
        StringBuilder reverse = new StringBuilder();
        for(int k = words.length-1; k >=0; k--){
            reverse.append(words[k]).append(" ");
        }
        System.out.println(reverse.toString().trim()+"\n");
    }
}
