package com.lance.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by perdonare on 2017/2/21.
 */
public class StraightInsertionSortDemoTest {
    @Test
    public void sort() throws Exception {
        StraightInsertionSortDemo straightInsertionSortDemo = new StraightInsertionSortDemo();
        int[] array = {1,5,4,9,7};
        array = straightInsertionSortDemo.sort(array);
        System.out.println(Arrays.toString(array));
    }

}