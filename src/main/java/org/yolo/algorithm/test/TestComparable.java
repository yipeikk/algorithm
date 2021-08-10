package org.yolo.algorithm.test;

import org.yolo.algorithm.sort.Student;

/**
 * Created by yipei using IntelliJ IDEA.
 * Date: 2021/8/9 10:02
 */
public class TestComparable {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("zhangsan");
        stu1.setAge(17);
        Student stu2 = new Student();
        stu2.setName("lisi");
        stu2.setAge(19);
        Comparable max = getMax(stu1, stu2);
        System.out.println(max);
    }

    private static Comparable getMax(Comparable c1, Comparable c2){
        return c1.compareTo(c2)>0?c1:c2;
    }
}
