package org.yolo.algorithm.test;

import org.yolo.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:44
 */
public class TestSelection {

    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
