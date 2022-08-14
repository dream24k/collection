package com.lx.test;

import java.util.*;

public class TreeMapTest {
    // 自然排序
    public void test1(){
        TreeMap map = new TreeMap();
        User user1 = new User("Tom",20);
        User user2 = new User("Jack",21);
        User user3 = new User("Marry",22);

        map.put(1,user1);
        map.put(2,user2);
        map.put(3,user3);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }

    // 定制排序
    public void test2(){
        TreeMap map = new TreeMap(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(),user2.getAge());
                }
                throw new RuntimeException("输入的类型不匹配！");
            }
        });
        User user1 = new User("Tom",25);
        User user2 = new User("Jack",21);
        User user3 = new User("Marry",22);

        map.put(user1,1);
        map.put(user2,2);
        map.put(user3,3);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        TreeMapTest test = new TreeMapTest();
        test.test1();
        test.test2();
    }
}
