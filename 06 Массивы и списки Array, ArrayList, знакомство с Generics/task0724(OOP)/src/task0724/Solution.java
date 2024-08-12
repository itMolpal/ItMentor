package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

import java.util.ArrayList;
import java.util.Collection;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        Human grandfatherDad = new Human("Сергей Сергеевич", true, 98, null, null);
        Human grandmotherDad = new Human("Алла Егоровна", false, 87, null, null);
        Human grandfatherMom = new Human("Олег Михайлович", true, 54, null, null);
        Human grandmotherMom = new Human("баба Юля", false, 70, null, null);
        Human uncle = new Human("дядя Вася", true, 23, grandfatherDad, grandmotherDad);
        Human aunt = new Human("тетя Оля", false, 42, grandfatherMom, grandmotherMom);
        Human father = new Human("Папуся", true, 30, grandfatherDad, grandmotherDad);
        Human mother = new Human("Мамуся", false, 19, grandfatherMom, grandmotherMom);
        Human son = new Human("Максимка", true, 9, father, mother);

        ArrayList<Human>humans = new ArrayList<>();
        humans.add(grandfatherDad);
        humans.add(grandmotherDad);
        humans.add(grandfatherMom);
        humans.add(grandmotherMom);
        humans.add(uncle);
        humans.add(aunt);
        humans.add(father);
        humans.add(mother);
        humans.add(son);

        for (Human human : humans) {
            System.out.println(human.toString());
        }

    }

    public static class Human {
        // напишите тут ваш код

        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, Boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.sex = sex;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}