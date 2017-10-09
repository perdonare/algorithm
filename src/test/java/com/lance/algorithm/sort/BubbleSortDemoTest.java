package com.lance.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortDemoTest {
    /**
     1 3 5 7 3 2 9  输入

     1 3 5 7 3 2 9
     1 2 5 7 3 3 9
     1 2 3 7 5 3 9
     1 2 3 3 5 7 9
     1 2 3 3 5 7 9
     **/
    @Test
    public void sort() throws Exception {
        BubbleSortDemo.sort(new int[]{1,3,5,7,3,2,9});
    }

    /**
     * 1 3 5 7 3 2 9  输入
     *
     * 1 3 5 3 2 7 9
     * 1 3 3 2 5 7 9
     * 1 3 2 3 5 7 9
     * 1 2 3 3 5 7 9
     */
    @Test
    public void sort2() throws Exception {
        BubbleSortDemo.sort2(new int[]{1,3,5,7,3,2,9});
    }

}