package com.lx.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        /* 在调用iterator.next()方法之前必须要调用iterator.hasNext()进行检测。若不调用，
         且下一条记录无效，直接调用iterator.next()会抛出NoSuchElementException异常*/
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        /* 错误方式：跳着输出，因为调用了两次next方法，而且也会产生空指针异常
        Iterator iterator = collection.iterator();
        while((iterator.next()) != null){
            System.out.println(iterator.next());
        }*/

        // 错误方式：集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
        /*while(collection.iterator().hasNext()){
            System.out.println(collection.iterator().next());
        }*/
    }

    public void test3(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add(new Person("Jack",20));
        collection.add(false);

        // 删除集合中“Tom”
        Iterator iterator = collection.iterator();
        // 如果还未调用next()或在上一次调用next方法之后已经调用了remove方法，
        // 再调用remove就会报IllegalStateException
        while(iterator.hasNext()){
            //iterator.remove();
            Object obj = iterator.next();
            if ("Tom".equals(obj)){
                iterator.remove();
            }
        }

        iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        IteratorTest test = new IteratorTest();
        test.test1();
        test.test2();
        test.test3();
    }
}
