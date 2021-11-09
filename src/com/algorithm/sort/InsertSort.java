package com.algorithm.sort;

import java.util.Arrays;

public class InsertSort {
    public static void InsertSort(int[] numbers){
        for (int i=0;i<numbers.length-1;i++){
            //外层循环控制比较次数
            for (int j=i+1;j>0;j--){
                //从第二个元素开始比较
                if (numbers[j]<numbers[j-1]) {
                    //例如第一次，如果第2个元素小于默认排好的第一个元素
                    int temp=numbers[j];//第二个元素赋值给临时变量
                    numbers[j]=numbers[j-1];//第一个元素赋值给第二元素
                    numbers[j-1]=temp;//临时变量赋值给第一个元素
                }
            }
        }
    }
    public static void main(String[] args) {
        //使用
        int[] n={60,38,5,14,7,23,89,77,88,4,35,45,67,99,87};
        System.out.println(Arrays.toString(n));
        InsertSort(n);
        System.out.println(Arrays.toString(n));
    }
}
