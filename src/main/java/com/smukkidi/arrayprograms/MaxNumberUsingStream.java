package com.smukkidi.arrayprograms;

import java.util.Arrays;

public class MaxNumberUsingStream {
    public static void main(String[] args) {
        int arr[] = {10, 30, 50, 20, 30, 100, 70, 80};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest number in given array :: " + max);
    }
}
