package com.lance.algorithm.sort;

/**
 * Created by perdonare on 2017/2/18.
 */
public class QuickSortDemo {
    public void quick(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array,int left, int right) {
        if (left < right) {
            int baseIndex = partition(array, left, right);
            sort(array, left, baseIndex - 1);
            sort(array, baseIndex + 1, right);
        }
    }

    /**
     * 5 4 1 3 9 2 7
     *
     *
     *
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];     //枢轴记录
        while (low<high){
            while (low<high && arr[high]>=pivot)
                --high;
            while (low < high && arr[low] < pivot) {
                arr[low] = arr[high];
                ++low;
                arr[high] = arr[low];
            }
        }
        //扫描完成，枢轴到位
        arr[low] = pivot;
        //返回的是枢轴的位置
        return low;
    }


}
