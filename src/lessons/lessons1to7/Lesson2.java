package lessons.lessons1to7;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

        String line = "____________________________________";

        int a = +5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        //Конкатенация
        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);
        // System.out.println("c = ", c); - Так нельзя!

        System.out.println("Сумма переменных a и b =  " + a + b);

        //Арифметическое сложение
        System.out.println("Сумма переменных a и b =  " + (a + b));
        System.out.println("Сумма переменных a и b =  " + sumAB);
        System.out.println(a + b + "a =   ");
        System.out.println(a + b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        //То, что до текста/строки - арифм.выражение, то, что после текста/строки - конкатенация
        System.out.println(line);
        System.out.println(a + b + "" + a + b);
        System.out.println(line);
        System.out.println("Он сказал \"Поехали!\" и махнул рукой");
        System.out.println("Сегодня cуббота");
        System.out.println("Сегодня\ncуббота"); //перенос на другую строку
        System.out.println("Сегодня\tcуббота"); //табуляция (добавляется столько пробелов, сколько нужно до полной четверки символов)
        System.out.println(line);

        //Конкатенация
        System.out.println("" + a + b + c);
        System.out.println("" + a + " " + b + " " + c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        //Конкатенация
        System.out.print("Сегодня ");
        System.out.println("Суббота");

        //Арифметическое вычитание
        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);
        System.out.println(line);

        //Умножение
        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);
        System.out.println(line);

        //Деление
        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);
        System.out.println(devAB);
        System.out.println(line);

        //Остаточное деление/Остаток от деления
        System.out.println(a % b);
        System.out.println(b % a);

        // Покажите, что 25 кратно 5
        System.out.println(25 % 5);

        // 100 кратно 2
        System.out.println(100 % 2);

        // 100 не кратно 3
        System.out.println(100 % 3);

        //Унарные операторы -- и ++         a++; это то же самое, что a + 1
        // Так не сработает!!! System.out.println(a++);
        System.out.println(line);
        a--;
        System.out.println(a);
        b--;
        System.out.println(b);
        System.out.println(b - 1);
    }
}
