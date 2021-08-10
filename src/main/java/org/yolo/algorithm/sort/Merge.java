package org.yolo.algorithm.sort;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:35
 * 归并排序
 * 分治法
 * 递归思想
 * 将无序数组一直分组排序
 * 最后将排序好的一个个小序列合并成一个大的有序数列
 * 时间复杂度为 N*logN
 * 需要申请额外的数组空间 空间换时间的操作
 */
public class Merge {


    private static Comparable[] assist;//归并排序需要的辅助数组

    /**
     * 排序
     * @param array
     */
    public static void sort(Comparable[] array){
        assist = new Comparable[array.length];
        sort(array,0,array.length-1);
    }


    /**
     * 排序 索引startIndex到索引endIndex的数组
     * @param array
     * @param startIndex
     * @param endIndex
     */
    public static void sort(Comparable[] array, int startIndex, int endIndex){
        //递归结束条件 当开始索引和结束索引相同时 代表已经不能再进行分组了
        if(startIndex>=endIndex){
            return;
        }

        //取分组中间值
        int mid = startIndex + (endIndex-startIndex)/2;

        //对左边分组进行排序
        sort(array,startIndex,mid);

        //对右边分组进行排序
        sort(array,mid+1,endIndex);

        //排序完成后需要进行合并js
        merge(array,startIndex,mid,endIndex);
    }

    /**
     * 合并
     * @param array
     * @param startIndex
     * @param mid
     * @param endIndex
     */
    public static void merge(Comparable[] array,int startIndex,int mid,int endIndex){
        //定义三个指针
        //指向辅助数组开始填充数据的索引
        int p = startIndex;
        //指向左侧数组的起始位置
        int p1 = startIndex;
        //指向右侧数组的起始位置
        int p2 = mid+1;

        //指针移动排序
        //比较左边小组和右边小组中的元素大小，哪个小，就把哪个数据填充到assist数组中
        while (p1<=mid && p2<=endIndex ){
            if(less(array[p1],array[p2])){
                assist[p++] = array[p1++];
            }else {
                assist[p++] = array[p2++];
            }
        }

        //上面的循环结束后，如果退出循环的条件是p1<=mid，则证明左边小组中的数据已经归并完毕，如果退出循环的条件是p2<=hi,则证明右边小组的数据已经填充完毕；
        //所以需要把未填充完毕的数据继续填充到assist中
        // 下面两个循环，只会执行其中的一个
        while (p1<=mid){
            assist[p++] = array[p1++];
        }

        while (p2<=endIndex){
            assist[p++] = array[p2++];
        }

        //数组startIndex到endIndex是有序的
        //将其拷贝到原数组
        for(int index = startIndex; index<=endIndex; index++){
            array[index] = assist[index];
        }
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

}
