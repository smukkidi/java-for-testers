package com.smukkidi.largenumberinAraay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberUsingCollection {
    public static void main(String[] args) {
        int arr[] = {20, 50, 80, 100, 30, 40, 60};

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        int max = Collections.max(list);
        System.out.println("Largest value in given array :: " + max);
    }
}
