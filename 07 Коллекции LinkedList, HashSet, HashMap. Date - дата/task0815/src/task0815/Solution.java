package task0815;

import java.util.*;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "8");
        map.put("c", "3");
        map.put("d", "8");
        map.put("as", "5");
        map.put("sd", "6");
        map.put("g", "8");
        map.put("aff", "1");
        map.put("saf", "9");
        map.put("j", "10");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код

        ArrayList<String> names = new ArrayList<>(map.values());
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                count++;
            }
        }
        return count;
    }
    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        ArrayList<String> surnames = new ArrayList<>(map.keySet());
        for (int i = 0; i < surnames.size(); i++) {
            if (surnames.get(i).equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "8"));
        System.out.println(getCountTheSameLastName(map, "a"));

    }
}
