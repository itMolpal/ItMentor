package task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Month month = new Month(br.readLine());
    }
}

class Month {
    Month(String month) {
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        for (int i = 0; i < months.size(); i++) {
            if (months.get(i).equals(month)) {
                System.out.println(months.get(i) + " is " + (i+1) + " month" );
            }
        }





//        switch (month) {
//            case "January" -> System.out.println(months.get(0) + " is 1 month");
//            case "February" -> System.out.println("February is 2 months");
//            case "March" -> System.out.println("March is 3 months");
//            case "April" -> System.out.println("April is 4 months");
//            case "May" -> System.out.println("May is 5 months");
//            case "June" -> System.out.println("June is 6 months");
//            case "July" -> System.out.println("July is 7 months");
//            case "August" -> System.out.println("August is 8 months");
//            case "September" -> System.out.println("September is 9 months");
//            case "October" -> System.out.println("October is 10 months");
//            case "November" -> System.out.println("November is 11 months");
//            case "December" -> System.out.println("December is 12 months");
//
//        }
    }
}
