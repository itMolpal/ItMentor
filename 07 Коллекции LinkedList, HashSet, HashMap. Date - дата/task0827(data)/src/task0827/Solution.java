package task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MARCH 1 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date dateTo = new Date(date);
        Date startYear = new Date();
        startYear.setDate(1);
        long d = dateTo.getTime() - startYear.getTime();
        long ms = 1000 * 60 * 60 * 24;
        int dayCount = (int) (d / ms);
        if (dayCount % 2 != 0)
            return true;
        else
            return false;
    }
}