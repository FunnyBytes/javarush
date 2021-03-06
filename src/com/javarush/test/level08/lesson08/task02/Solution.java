package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set= new HashSet<Integer>();

        set.add(123);
        set.add(124);
        set.add(10);
        set.add(12);
        set.add(13);
        set.add(23);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1223);
        set.add(1232);
        set.add(1123);
        set.add(1233);
        set.add(1323);

        return  set;

    }



    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            int i = iterator.next();
            if (i >10) iterator.remove();
        }
        return set;

    }
}
