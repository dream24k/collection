package com.lx.test;

import java.util.*;

// 展示Collection接口方法
public class CollectionTest {
    public void test1(){
        Collection collection = new ArrayList();

        // 添加元素 add(Object obj)    addAll(Collection coll)
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Tom",20));

        // 是否包含某个元素
        // boolean contains(Object obj):是通过元素的equals方法来判断是否是同一个对象
        // boolean containsAll(Collection c):也是调用元素的equals方法来比较的。拿两个集合的元素挨个比较
        boolean contains = collection.contains(123);

        System.out.println(contains);           // true
        System.out.println(collection.contains("Tom"));             // true
        System.out.println(collection.contains(new Person("TOM",20)));          // false

        Collection collection1 = Arrays.asList(123,456);
        System.out.println(collection.containsAll(collection1));        // true
    }

    public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        // boolean remove(Object obj)：通过元素的equals方法判断是否要删除的那个元素
        //                             只会删除找到的第一个元素
        // boolean removeAll(Collection c)：把交集的结果存在当前集合中，不影响c

        collection.remove(1234);
        System.out.println(collection);
        // [123,456,Tom,Person{name='Jack',age=20},false]

        collection.remove(new Person("Jack",20));
        System.out.println(collection);
        // [123,456,Tom,false]

        Collection collection1 = Arrays.asList(123,456);
        collection.removeAll(collection1);
        System.out.println(collection);
        // [Tom,false]
    }

    public void test3(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        // boolean retainAll(Collection coll)：把交集的结果存在当前集合中，不影响coll
//        Collection collection1 = Arrays.asList(123,456,789);
//        collection.retainAll(collection1);
//        System.out.println(collection);       // [123,456]

        Collection collection1 = new ArrayList();
        collection1.add(456);
        collection1.add(123);
        collection1.add("Tom");
        collection1.add(new Person("Jack",20));
        collection1.add(false);

        // equals(Object obj)：要想返回TRUE，需要当前集合和形参集合的元素都相同
        System.out.println(collection.equals(collection1));     // false
    }

    public void test4(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        // 返回对象的哈希值
        System.out.println(collection.hashCode());

        // Object[] toArray()：转成对象数组
        Object[] arr = collection.toArray();
        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // 数组转换成集合，调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);       // [AA,BB,CC]

        // 认为是一个元素，因为使用的是基本数据类型，且存放的是一个数组，所以是一个元素
        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1.size());        // 1

        // 认为是两个元素，英文使用的是包装类
        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());        // 2

        // iterator()：返回迭代器对象，用于集合遍历
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        CollectionTest test = new CollectionTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }
}
