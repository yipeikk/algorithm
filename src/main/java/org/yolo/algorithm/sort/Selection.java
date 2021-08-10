package org.yolo.algorithm.sort;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:35
 * 选择排序
 * 时间复杂度为O(n^2)
 */
public class Selection {


    /**
     * 排序
     * @param array
     */
    public static void sort(Comparable[] array){

        //六个元素只需要选择五次
        for (int i =0; i<array.length-1; i++){
            //最小元素索引
            int minIndex = i;
            for(int j = i+1; j<array.length; j++){
                //比较 找出最小元素
                if(greater(array[minIndex],array[j])){
                    minIndex = j;
                }
            }
            //交换位置
            if(minIndex!=i){
                exch(array,i,minIndex);
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
