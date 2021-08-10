package org.yolo.algorithm.sort;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:35
 * 快速排序
 *
 */
public class Quick {


    /**
     * 排序
     * @param array
     */
    public static void sort(Comparable[] array){

    }


    /**
     * 快速排序
     * @param array
     * @param startIndex
     * @param endIndex
     */
    public static void sort(Comparable[] array,int startIndex,int endIndex){

        //递归结束条件
        if(endIndex<=startIndex){
            return;
        }

        //数组根据基准值切分 返回值为切分的中间数值
        int partition = partition(array, startIndex, endIndex);

        //对切分的左边数组再次进行排序
        sort(array,startIndex,partition-1);

        //对切分的右边数值再次进行排序
        sort(array,partition+1,endIndex);
    }

    /**
     * 数组分隔
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition(Comparable[] array, int startIndex, int endIndex) {
        //选取基准值
        Comparable key = array[startIndex];

        //左边指针
        int leftPoint = startIndex;

        //右边指针
        int rightPoint = endIndex+1;

        //进行切分
        while (true){
            while (less(key,array[--rightPoint])){
                if(rightPoint==startIndex){
                    break;
                }
            }

            while (less(array[++leftPoint],key)){
                if(leftPoint==endIndex){
                    break;
                }
            }

            if(leftPoint>=rightPoint){
                break;
            }else {
                exch(array,leftPoint,rightPoint);
            }
        }

        exch(array,startIndex,rightPoint);
        return rightPoint;

    }


    /**
     * 比较大小
     * @param c1
     * @param c2
     * @return
     */
    private static boolean less(Comparable c1,Comparable c2){
        return c1.compareTo(c2)<0;
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
