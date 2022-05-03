package homework.hw8;

import utils.Utils;

import java.util.Arrays;

import static homework.hw8.HW8_1.*;
import static utils.Utils.*;

public class HW8 {

    public static void lineFor6() {
        System.out.println("-".repeat(65));
    }

    public static void compareTable(Double db1, Double db2, Integer int1, Integer int2, String str1, String str2) {

        lineFor6();
        System.out.println(" HW8\t\t\t\t\t| HW8_1\t\t\t\t\t| areEquals?");
        lineFor6();
        System.out.println(" Double db2 = " + db2 + "\t\t" + "| " + "Double db1 = " + db1 + "\t\t" + "| "
                + db2.equals(db1));
        lineFor6();
        System.out.println(" Integer int2 = " + int2 + "\t\t" + "| " + "Integer int1 = " + int1 + "\t\t" + "| "
                + int2.equals(int1));
        lineFor6();
        System.out.println(" String str2 = " + str2 + "\t\t" + "| " + "String str1 = " + str1 + "\t" + "| "
                + str2.equals(str1));
        lineFor6();

    }

    public static int[] returnArr7(int a1, int a2, int a3, int a4, int a5) {
        int[] arr7 = {a1, a2, a3, a4, a5};

        return arr7;
    }

    public static double[] returnArr8(double a1, double a2, double a3, double a4, double a5) {
        double[] arr8 = {a1, a2, a3, a4, a5};

        return arr8;
    }

    public static String[] returnArr9(String a1, String a2, String a3, String a4, String a5) {
        String[] arr9 = {a1, a2, a3, a4, a5};

        return arr9;
    }

    public static double[] returnArr10(int[] arr) {

        double[] resultArr = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = 2.5 * arr[i];
        }

        return resultArr;
    }

    public static int returnEven(int[] arr) {

        int resultCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.println("Массив принимает только положительные числа");

                return resultCount;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                resultCount++;
            }
        }
        System.out.println(resultCount);

        return resultCount;
    }

    public static int returnOdd(int[] arr) {

        int resultCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.println("Массив принимает только положительные числа");

                return resultCount;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                resultCount++;
            }
        }
        System.out.println(resultCount);

        return resultCount;
    }

    public static boolean[] returnBoolean(int[] arr) {

        boolean[] resultArr = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 10) {
                resultArr[i] = true;
            } else {
                resultArr[i] = false;
            }
        }
        return resultArr;
    }

    public static String returnString(String[] arr) {

//        String str = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                str = arr[i];
//            } else {
//            str = str + " " + arr[i];
//            }
//        }

        String str = arr[0];

        for (int i = 1; i < arr.length; i++) {
            str = str + " " + arr[i];
        }

        return str;
    }

    public static int returnSumSecondPart(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                if (i >= arr.length / 2) {
                    sum = sum + arr[i];
                }
            } else {
                if (i >= (arr.length / 2) + 1) {
                    sum = sum + arr[i];
                }
            }
        }

        return sum;
    }

    public static int[] returnMultiplication(int a) {

        int[] resultArr = new int[11];

        if (a < 1 || a > 10) {
            System.out.println("Число должно попадать в диапазон от 1 до 10");

            return resultArr;
        }

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = i * a;
        }

        return resultArr;
    }





    public static void main(String[] args) {

        part(1);
        task(5);

        Integer int2 = 7;
        Double db2 = 5.5;
        String str2 = "tes";


        task(6);
        compareTable(db1,db2,int1,int2,str1,str2);

        task(7);
//        Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        int a1 = 1;
        int a2 = 3;
        int a3 = 5;
        int a4 = 3;
        int a5 = 1;

        System.out.println(Arrays.toString(returnArr7(a1,a2,a3,a4,a5)));

        task(8);
//        Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        double d1 = 1.5;
        double d2 = 3.4;
        double d3 = 5.3;
        double d4 = 3.2;
        double d5 = 1.1;

        System.out.println(Arrays.toString(returnArr8(d1,d2,d3,d4,d5)));

        task(9);
//        Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        String s1 = "Когда-нибудь";
        String s2 = "я";
        String s3 = "стану";
        String s4 = "крутым";
        String s5 = "тестировщиком";

        System.out.println(Arrays.toString(returnArr9(s1,s2,s3,s4,s5)));

        task(10);
//        Написать метод, который принимает на вход массив целых чисел,
//        и возвращает массив тех же чисел, умноженных на 2.5

        int[] arr10 = {1,2,3,4,5};

        System.out.println(Arrays.toString(returnArr10(arr10)));

        task(11);
//        Написать метод, который принимает на вход массив целых положительных чисел,
//        и возвращает количество четных чисел в этом массиве

        int[] arr11 = {2,2,3,4,-1};

        returnEven(arr11);

        task(12);
//        Написать метод, который принимает на вход массив целых положительных чисел,
//        и возвращает массив нечетных чисел

        int[] arr12 = {1,2,3,1,9};

        returnOdd(arr12);
//
        part(2);
        task(13);
//        Написать метод, который принимает на вход масив целых чисел,  и возвращает массив значений true или false,
//        если числа больше 10

        int[] arr13 = {1,2,3,1,9,30,4};

        System.out.println(Arrays.toString(returnBoolean(arr13)));

        task(14);
//        Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов

        String[] arr14 = {"Когда-нибудь","я","стану","крутым","тестировщиком"};

        System.out.println(returnString(arr14));
        System.out.println(returnString(returnArr9(s1,s2,s3,s4,s5)));

        task(15);
//        Написать метод, который принимает массив целых чисел и
//        считает сумму чисел во второй половине массива

        int[] arr15 = {1,2,3,1,1,9,30,4};

        System.out.println(returnSumSecondPart(arr15));

        verifyEquals(returnSumSecondPart(arr15),44);
        verifyEquals(returnSumSecondPart(arr15),43);
        verifyEquals(returnSumSecondPart(arr15),45);
        verifyEquals(returnSumSecondPart(arr15),0);
        verifyEquals(returnSumSecondPart(arr15),-1);

        task(16);
//        Написать метод, который принимает на вход целое положительные число
//        в пределах от 1 до 10 исключительно, и возвращает таблицу умножения
//        на это число в виде массива
//        Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

        int a = 9;

        System.out.println(Arrays.toString(returnMultiplication(a)));

//        task(17);
//        Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
//        task(18);
//        Написать метод, который принимает на вход длину массива и генерирует массив случаейных положительных чисел от 0 до 100 исключительно.
//        task(19);
//        Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l, в котором все числа имеют количество знаков d
//        task(20);
//        Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
//        task(21);
//        Написать метод, который принимает на вход массив целых положительных двузначных чисел, и возвращает массив разниц между десятками и единицами
//
//
//
//        part(3);
//        task(22);
//        Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив, который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
//        Например:
//        method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
//        task(23);
//        Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел.
//        task(24);
//        Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество уникальных и неуникальных элементов в этом массиве
//        task(25);
//        Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительнх числа (значения индексов). Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
//        Например:
//        method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
//
//        task(26);
//        Написать метод, который принимает на вход 2 массива int[] и возвращает объединенный массив уникальных неповторяющихся элементов








    }



}
