package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

//DONE

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        String longest = list.getFirst();
        String shortest = list.getFirst();

        for (String string : list) {
            if (shortest.length() > string.length()) {
                shortest = string;
            }
            if (longest.length() < string.length()) {
                longest = string;
            }
        }
        int shortestLength = list.indexOf(shortest);
        int longestLength = list.indexOf(longest);

        System.out.println(shortestLength > longestLength ? list.get(longestLength) : list.get(shortestLength));

    }
}
