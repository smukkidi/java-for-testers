package com.smukkidi.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArray {
   //Find the largest number from given array
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 90, 100, 40, 60, 50};
       
        int largetNumber = 0;
        for(int i = 0; i < arr.length; i++){
            if(largetNumber < arr[i]){
                largetNumber = arr[i];
            }
        }
        System.out.println("\nLargest Number :: "+largetNumber);

        //Using utility method
        int maxN = largest(arr);
        System.out.println("Max number is :: "+maxN);

        // Working with Java 8 streams
        int streamMax = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max using stream java 8 :: "+streamMax);

        // Using sorting
        int n = arr.length;
        int maxNumber = largestMethodTwo(arr, n);
        System.out.println("Max number using sort :: " + maxNumber);

        // With out user defined function
        Arrays.sort(arr);
        System.out.println("Print max value with out user defined function :: "+arr[arr.length - 1]);

        // Using collections
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println("Using collections :: "+ Collections.max(list));
    }
    public static int largestMethodTwo(int []arr, int n){

        Arrays.sort(arr);
        return arr[n - 1];
    }
    public static  int largest(int []arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
