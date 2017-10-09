package com.lance.algorithm.sort;

import java.util.Arrays;

/**
 * Created by perdonare on 2017/2/18.
 */
public class BubbleSortDemo {
    /**
     * 每次排序把最小的元素筛选出来
     * @param array
     */
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            // j < array.length   是  array.length  不是 i
            for (int j = i+1 ; j < array.length; j++) {
                // 是 j < i
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * 每次排序把最大的元素筛选出来,放在最后
     * @param array
     */
    public static void sort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}

