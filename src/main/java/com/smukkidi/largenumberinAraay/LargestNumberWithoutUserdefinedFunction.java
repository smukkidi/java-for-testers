package com.smukkidi.largenumberinAraay;

import java.util.Arrays;

public class LargestNumberWithoutUserdefinedFunction {
    public static void main(String[] args) {
        int arr[] = {20, 50, 80, 100, 30, 40, 60};
        Arrays.sort(arr);
        System.out.println("Largest number in given array :: " + arr[arr.length - 1]);
    }
}
