package com.smukkidi.arrayprograms;

import java.util.Arrays;

public class LargestNumberUsingSorting {
    public static void main(String[] args) {
        int arr[] = {30, 10, 20, 50, 40};
        int n = arr.length;
        int max = largestNumber(arr, n);
        System.out.println("Largest number in given array :: " + max);
    }
    public static int largestNumber(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
}
