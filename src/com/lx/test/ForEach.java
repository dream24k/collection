package com.lx.test;

import java.util.ArrayList;
import java.util.Collection;

public class ForEach {
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        // for(集合元素的类型 局部变量 ：集合对象)
        // 内部仍然调用了迭代器
        for (Object obj : collection){
            System.out.println(obj);
        }
    }

    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i : arr){
            System.out.println(i);
        }
    }

    public void test3(){
        String[] arr = new String[]{"YYYY","MM","DD"};
        for (String s : arr){
            System.out.println(s);
        }

        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ForEach test = new ForEach();
        test.test1();
        test.test2();
        test.test3();
    }
}
