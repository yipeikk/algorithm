package org.yolo.algorithm.sort;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:46
 * 插入排序
 * 时间复杂度为O(n^2)
 */
public class Insertion {

    /**
     * 排序
     * @param array
     */
    public static void sort(Comparable[] array){
        //六个元素只需要插入五次
       for(int i =0; i<array.length-1; i++){
           //当前元素为a[j],依次和i前面的元素比较，找到一个小于等于a[i]的元素
           for(int j=i+1; j>0; j--){
               if(greater(array[j-1],array[j])){
                   exch(array,j-1,j);
               }else {
                   //前面是已经排序数组 找到正确位置 跳出
                   break;
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
