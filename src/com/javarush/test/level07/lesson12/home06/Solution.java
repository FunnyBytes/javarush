package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("Василий", true, 62, null, null);
        Human grandmother1 = new Human("Надежда", false, 60, null, null);
        Human grandfather2 = new Human("Николай", true, 60, null, null);
        Human grandmother2 = new Human("Анна", false, 59, null, null);
        Human father = new Human("Денис", true, 26, grandfather1, grandmother1);
        Human mother = new Human("Ирина", false, 33, grandfather2, grandmother2);
        Human children1 = new Human("Варвара", false, 16, father, mother);
        Human children2 = new Human("Данил", true, 13, father, mother);
        Human children3 = new Human("Кирил", true, 13, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
                //напишите тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father  = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
