package com.algorithm.sort;

public class BubbleSortPlu {
    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5,6,9,8,7};
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n =0;
        for (int i = arr.length-1; i >0; i--) {
            boolean flag = false;
            for (int j = 0 ;j<i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
                n++;
            }
            if (!flag)
                break;
        }
        System.out.println("比较次数："+n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
