package com.smukkidi.print2darray;

public class Print2DArrayUsingForEachLoop{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        print2DArray(arr);
    }
    public static void print2DArray(int arr[][]){
        for(int[] row : arr){
            for(int col : row){
                System.out.print(col + " ");
            }
        }
    }
}