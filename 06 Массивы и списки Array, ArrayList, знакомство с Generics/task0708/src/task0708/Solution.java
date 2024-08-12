package task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/
//DONE

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArrayList <String> maxLength = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(sc.next());
        }
        sc.close();

        strings.sort((o1, o2) -> o1.length() - o2.length());
        String maxString = strings.getLast();
        for (int i = 4; i >= 0; i--) {
            if (strings.get(i).length() == maxString.length()) {
                maxLength.add(strings.get(i));
            }
        }

        for (String max : maxLength) {
            System.out.println(max);
        }
    }
}
