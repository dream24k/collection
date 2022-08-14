package com.lx.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public void test1(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void test2(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    public void test3(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void test4(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        for (Integer key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    public void test5(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        map.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });
    }

    /*
    *   stream和parallelStream语法差异较小，从执行结果来看，stream顺序输出，而parallelStream无序输出
    *   parallelStream执行耗时是stream的五分之一。
    */
    public void test6(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        map.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }

    public void test7(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"Spring");
        map.put(4,"Mybatis");
        map.put(5,"JDK");

        map.entrySet().parallelStream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }

    public static void main(String[] args) {
        HashMapTest test = new HashMapTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }
}
