package org.yolo.algorithm.test;


import org.yolo.algorithm.sort.Insertion;

import java.util.Arrays;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:33
 */
public class TestInsertion {

    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
