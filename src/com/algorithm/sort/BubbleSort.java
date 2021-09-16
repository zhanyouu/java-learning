package com.algorithm.sort;

public class BubbleSort {
    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5,6,9,8,7};
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0 ;j<i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
