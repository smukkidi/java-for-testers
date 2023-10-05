package com.smukkidi.largenumberinAraay;

public class MaxNumberUsingIterativeWay {
    public static void main(String[] args) {

        int arr[] = {100, 20, 60, 10};
        int max = largest(arr);
        System.out.println("Largest number in given array :: " + max);
        
    }
    static int largest(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)    {
                max = arr[i];
            }
          }  
        return max;
    }
}
