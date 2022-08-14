package com.lx.test;

import java.util.*;

public class MapTest {
    public void test1(){
        Map map = new HashMap();
        map.put(null,"Java");

        System.out.println(map.entrySet());
    }

    public void test2(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",456);
        map.put("AA",345);

        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);

        map.putAll(map1);
        System.out.println(map);

        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);
    }

    public void test3(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",456);

        System.out.println(map.get(45));

        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        isExist = map.containsValue(123);
        System.out.println(isExist);

        map.clear();
        System.out.println(map.isEmpty());
    }

    public void test4(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",456);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        Collection values = map.values();
        for (Object obj : values){
            System.out.println(obj);
        }
        System.out.println();

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object object = iterator1.next();
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println();

        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "===" + value);
        }

    }

    public static void main(String[] args) {
        MapTest test = new MapTest();
//        test.test1();
//        test.test2();
//        test.test3();
        test.test4();
    }
}
