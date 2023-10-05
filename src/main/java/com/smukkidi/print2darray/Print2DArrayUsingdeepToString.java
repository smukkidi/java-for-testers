package com.smukkidi.print2darray;

import java.util.Arrays;

public class Print2DArrayUsingdeepToString {
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        System.out.println(Arrays.deepToString(arr));
    }
}
