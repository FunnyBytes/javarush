package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        byte b =2;

        for (int i = 1; i  <= 100; i++)
        {
            int m = i % b;
            if (m == 0)
                System.out.println(i);
        }
        //напишите тут ваш код

    }
}
