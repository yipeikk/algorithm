package org.yolo.algorithm.sort;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:35
 * 希尔排序
 * 如果增量为除2的情况下容易出现极端情况{2,1,5,3,7,6,9,8}
 * 时间复杂度突破了O(n^2)
 * 增量不同 时间复杂度不同
 * 不稳定排序
 */
public class Shell {


    /**
     * 排序
     * @param array
     */
    public static void sort(Comparable[] array){
        //确定增量 增量为每次除2
        for(int step = array.length/2; step>0; step = step/2){

            //从增量值元素开始进行插入排序
            for(int i = step; i<array.length; i++){

                //保证是同组进行排序 确定有序列 临界值为大于step
                for(int j = i; j>=step; j-=step) {
                    if (greater(array[j - step], array[j])) {
                        exch(array,j-step,j);
                    }else {
                        break;
                    }
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
