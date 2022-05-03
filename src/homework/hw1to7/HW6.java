package homework.hw1to7;

import utils.Common;

public class HW6 {

    public static void taskForHW6(String num) {
        System.out.println("");
        Common.task(num);
    }

//    TaskForHW6("10");
//        Написать метод, который принимает на вход параметры start,  end, step,
//        и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
//        Точка выхода из цикла - число end.
    public static void task10(int start, int end, int step) {
        for (int i = start; i < end; i = i + step) {
                System.out.print(i + " ");
        }
    }

//    TaskForHW6("11");
//        Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля.
//        Длина последовательности = l.

    public static void task11(int l) {
        for (int i = 0; i < l * 2; i = i + 2) {
            System.out.print(i + " ");
        }
    }

//    TaskForHW6("12");
//        Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно

    public static void task12(int n) {
        int result = 1;
        for (int i = 1; i < (n + 1); i = i + 1) {
//            System.out.print(Math.pow(2, i) + " "); - выводит числа с типом double
            result = result * 2;
            System.out.print(result + " ");
        }
    }


    public static void main(String[] args) {

        Common.part(1);

        Common.task("1");
//        Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        taskForHW6("2");
//        Распечатать последовательность чисел от 10 исключительно до 0 включительно.

        for (int i = 9; i > -1 ; i--) {
            System.out.print(i + " ");
        }

        taskForHW6("3");
//        Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.

        for (int i = 50; i < 56 ; i += 2) {
            System.out.print(i + " ");
        }

        taskForHW6("4");
//        Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        taskForHW6("5");
//        Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

        for (double i = 12; i < 13; i = i + 0.1) {
            String iRound = String.format("%.1f",i);
            System.out.print(iRound + " ");
        }

        taskForHW6("6");
//        Распечатать последовательность четных чисел от 215 до 237 включительно

        for (int i = 215; i < 237; i = i + 1) {
            if (i % 2 == 0) {
            System.out.print(i + " ");
            }
        }

        taskForHW6("7");
//        Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.

        for (int i = 8; i < 14; i = i + 1) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("Проверить решение!!!");

        taskForHW6("8");
//        Распечатать последовательность, которая начинается с минимального значения типа данных short и
//        заканчивается максимальным значением short.
//        Числа в последовательности должны быть кратны 15001.

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i = (short) (i + 1)) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }

        taskForHW6("9");
//        Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
//        Числа, кратные 11, должны быть распечатаны синим цветом.
//        Числа, кратные 12, должны быть распечатаны красным цветом.
//        А ноль необходимо распечатать словом ZERO.

        for (int i = -10; i < 35; i = i + 1) {

            if (i == 0) {
                System.out.print("ZERO" + " ");
            } else if (i % 11 == 0) {
                System.out.print(Common.ANSI_BLUE + i + " " + Common.ANSI_RESET);
            } else if (i % 12 == 0) {
                System.out.print(Common.ANSI_RED + i + " " + Common.ANSI_RESET);
            } else {
                System.out.print(i + " ");
            }
        }

        taskForHW6("10");
//        Написать метод, который принимает на вход параметры start,  end, step,
//        и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
//        Точка выхода из цикла - число end.

        task10(2,15,1);

        Common.part(2);

        taskForHW6("11");
//        Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля.
//        Длина последовательности = l.

        task11(12);

        taskForHW6("12");
//        Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно

        task12(8);

        taskForHW6("13");
//        Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

        for (int i = 0; i < 5; i = i + 1) {
            for (int j = 0; j < 10; j = j + 1) {
                for (int k = 0; k < i; k++) {
                    System.out.print(j);
                }
            }
        }

        taskForHW6("14");
//        Распечатайте последовательность чисел:  0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print(0);
            } else {
            System.out.print(", " + i + ", " + i * -1);
            }
        }

    }

}
