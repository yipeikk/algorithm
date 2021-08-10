package org.yolo.algorithm.test;

import org.yolo.algorithm.sort.Quick;

import java.util.Arrays;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 19:03
 */
public class TestQuick {

    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
