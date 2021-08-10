package org.yolo.algorithm.sort;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:05
 * 冒泡排序
 * 时间复杂度为O(n^2)
 */
public class Bubble {


    /**
     * 排序
     * @param array
     */
    public static void sort(Comparable[] array){
        //六个元素只需要冒泡五次
        for(int i = 0; i<array.length-1; i++){
            //比较次数为长度-1减去已经比较好的元素数量
            for (int j=0; j<array.length-1-i; j++){
                if(greater(array[j],array[j+1])){
                    exch(array,j,j+1);
                }
            }
        }
    }


    /**
     * 比较大小
     * @param c1
     * @param c2
     * @return
     */
    private static boolean greater(Comparable c1,Comparable c2){
        return c1.compareTo(c2)>0;
    }

    /**
     * 交换数组的位置
     * @param arr
     * @param i
     * @param j
     */
    private static void exch(Comparable[] arr,int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
