package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

import java.lang.reflect.Array;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static void print(int a) {
        System.out.println(a);
    }
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(short a) {
        System.out.println(a);
    }
    public static void print(Array[] s) {
        System.out.println(s);
    }
    public static void print(Integer a) {
        System.out.println(a);
    }

}
