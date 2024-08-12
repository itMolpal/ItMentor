package task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Requirements:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int startSequence = 0;
        int maxSequence = 0;

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) == list.get(i)) {
                startSequence++;
                if (startSequence > maxSequence) {
                    maxSequence = startSequence;
                }
            }
            else
                startSequence = 1;
        }


        System.out.println(maxSequence);
    }
}
