package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void QuickSort(int[] a, int low, int high) {
        //这里的low 和hight 传递的是数组的起始位置0，和数组的结束位置length-1
        //已经排完
        if (low >= high) {
            return;
        }
        int left = low;//起始位置0,这位置是改变的
        int right = high;//结束位置length-1,这位置是改变的

        //保存基准值
        //这里是把起始位置的数，设置为基准数，如60
        int pivot = a[left];
        while (left < right) {
            //从后向前找到比基准小的元素
            while (left < right && a[right] >= pivot)
                right--;
            a[left] = a[right];
            //从前往后找到比基准大的元素
            while (left < right && a[left] <= pivot)
                left++;
            a[right] = a[left];
        }
        // 放置基准值，准备分治递归快排
        a[left] = pivot;
        QuickSort(a, low, left - 1);
        QuickSort(a, left + 1, high);
    }

    public static void main(String[] args) {
        //使用
        int[] n={60,38,5,14,7,23,89,77,88,4,35,45,67,99,87};
        System.out.println(Arrays.toString(n));
        QuickSort(n,0,n.length-1);
        System.out.println(Arrays.toString(n));
    }
}
