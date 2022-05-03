package homework.hw1to7;

import utils.Common;

import java.util.Arrays;
import java.util.Random;

public class HW7 {


//            Common.Task("18");
//        Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу метода тестом, если параметр - массив catsAges

    public static int averageArray(int[] arr) {

        int avg = 0;

        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        avg = avg / arr.length;

        return avg;
    }

    //        Common.Task("21");
//        Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
//        максимальное значение и среднее значение всех чисел массива.
//        Проверить работу метода на массиве из задания 20.

    public static int[] countArray(int[] arr) {

        int[] resultArr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            resultArr[0] += arr[i];
        }
        resultArr[0] = resultArr[0] / arr.length;

        resultArr[1] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (resultArr[1] > arr[i]) {
                resultArr[1] = arr[i];
            }
        }

        resultArr[2] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (resultArr[2] < arr[i]) {
                resultArr[2] = arr[i];
            }
        }

        return resultArr;
    }

    public static void main(String[] args) {

        Common.part(1);

        Common.task("1");
//        Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        String[] catsNames = new String[8];
        catsNames[0] = "Cat0";
        catsNames[1] = "Cat1";
        catsNames[2] = "Cat2";
        catsNames[3] = "Cat3";
        catsNames[4] = "Cat4";
        catsNames[5] = "Cat5";
        catsNames[6] = "Cat6";
        catsNames[7] = "Cat7";

        for (int i = 0; i < 8; i++) {
            System.out.println("index " + i + " ==> Name: " + catsNames[i]);
        }

        Common.task("2");
//        В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,  а значение элемента с индексом 1 на “Черныш”.
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        System.out.println(catsNames[4]);
        System.out.println(catsNames[1]);

        Common.task("3");
//        Создать массив catsColors и заполнить его значениями.

        String[] catsColors = {"color0","Grey","color2","color3","Grey","Grey","color6","color7"};

        for (int i = 0; i < 8; i++) {
            System.out.println("index " + i + " ==> Color: " + catsColors[i]);
        }

        Common.task("4");
//        Создать массив catsAges и заполнить его любыми значениями.

        int[] catsAges = {2,2,5,7,1,6,1,4};

        for (int i = 0; i < 8; i++) {
            System.out.println("index " + i + " ==> Age: " + catsAges[i]);
        }

        Common.task("5");
//        Создать массив isCatRed и заполнить его соответствующими значениями

        boolean[] isCatRed = {true, false, true, true, true, false, true, true};

        for (int i = 0; i < 8; i++) {
            System.out.println("index " + i + " ==> isCatRed: " + isCatRed[i]);
        }

        Common.task("6");
//        Распечатать для массивов catsNames и catsColors:
//          имя кота в коробке с номером 6
        System.out.println(catsNames[6]);

        System.out.println(Common.line(20));

//          имена котов из коробок с четными индексами
        for (int i = 0; i < 8; i += 2) {
            System.out.println("index " + i + " ==> Name: " + catsNames[i]);
        }
        System.out.println(Common.line(20));

//          имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.println("index " + i + " ==> Name: " + catsNames[i]);
            }
        }
        System.out.println(Common.line(20));

//          цвет котов из коробок с нечетными индексами
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.println("index " + i + " ==> Color: " + catsColors[i]);
            }
        }
        System.out.println(Common.line(20));

//          цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.println("index " + i + " ==> Name: " + catsColors[i]);
            }
        }

        Common.task("7");
//        Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Feed the cat with the index " + i);
            }
        }

        Common.task("8");
//        Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет

        for (int i = 0; i < 8; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Get your cat with index " + i + " vaccinated");
            }
        }

        Common.task("9");
//        Для кота в последней коробке распечатать имя, цвет, возраст

        int lastBox = catsNames.length - 1;
        System.out.println(catsNames[lastBox] + " / " + catsColors[lastBox] + " / " + catsAges[lastBox]);

        Common.task("10");
//        Распечатать имена всех котов, чей возраст больше 2 лет

        for (int i = 0; i < 8; i++) {
            if (catsAges[i] > 2) {
                System.out.println("index " + i + " ==> Name: " + catsNames[i]);
            }
        }

        Common.task("11");
//        Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true

        catsNames[3] = "Рыжик";

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик" && isCatRed[i] == true) {
                System.out.println("Feed the cat with the index " + i);
            }
        }


        Common.part(2);
//
        Common.task("12");
//        Распечатать средний возраст котов из массива catsAges

        for (int i = 0; i < 8; i++) {
            System.out.print(catsAges[i] + " ");
        }
        System.out.println();

        double average = 0.0;

        for (int i = 0; i < 8; i++) {
            average += catsAges[i];
        }
        average = average / catsAges.length;
        System.out.println(average);

        Common.task("13");
//        Распечатать возраст самого молодого кота

        int minAge = catsAges[0];
        String youngCat = catsNames[0];

        for (int i = 0; i < 8; i++) {
            if (minAge > catsAges[i]) {
                minAge = catsAges[i];
                youngCat = catsNames[i];
            }
        }
        System.out.println("Age of the youngest cat = " + minAge + ". It is " + youngCat);

        Common.task("14");
//        Распечатать возраст самого старого кота

        int maxAge = catsAges[0];
        String oldestCat = catsNames[0];

        for (int i = 0; i < 8; i++) {
            if (maxAge < catsAges[i]) {
                maxAge = catsAges[i];
                oldestCat = catsNames[i];
            }
        }
        System.out.println("Age of the oldest cat = " + maxAge + ". It is " + oldestCat);


        Common.task("15");
//        Распечатать количество серых котов

        int numberGreyCats = 0;
        catsColors[0] = "noGrey";

        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Grey") {
                numberGreyCats++;
            }
        }
        System.out.println("Number of gray cats = " + numberGreyCats);

        Common.task("16");
//        Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет

        for (int i = 0; i < catsNames.length; i++) {
            System.out.print(catsNames[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < catsNames.length; i++) {
            System.out.print(catsAges[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < catsNames.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] <= 3) {
                System.out.println(catsNames[i]);
            }
        }

        Common.task("17");
//        Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)

        int[] EvenPositiveNumbers = new int[5];
        int a = 2;

        for (int i = 0; i < 5; i++) {
            EvenPositiveNumbers[i] = a;
            a += 2;
            System.out.print(EvenPositiveNumbers[i] + " ");
        }

        Common.task("18");
//        Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу метода тестом, если параметр - массив catsAges

        int[] array18= new int[] {1,4,7,99,34,56};
        System.out.println(averageArray(array18));
        System.out.println(averageArray(catsAges));

        Common.task("19");
//        Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900

        int lowerBound = -1000;
        int upperBound = -900;
        int firstOddNegativeNumber = 0;
        int numberOddNegative = 0;

        for (int i = lowerBound; i < upperBound + 1; i++) {
            if (i % 2 != 0) {
                numberOddNegative++;
            }
        }
        System.out.println(numberOddNegative);

        if (lowerBound % 2 != 0) {
            firstOddNegativeNumber = lowerBound;
        } else {
            firstOddNegativeNumber = lowerBound + 1;
        }

        int[] OddNegativeNumbers = new int[numberOddNegative];
        for (int i = 0; i < OddNegativeNumbers.length; i++) {
            OddNegativeNumbers[i] = firstOddNegativeNumber;
            System.out.print(OddNegativeNumbers[i] + " ");

            firstOddNegativeNumber += 2;
        }

        Common.task("20");
//        Создать массив из 10 случайных положительных целых чисел

        System.out.println("Method 1");

        int[] RandomPositiveNumbers1 = new int[10];

        for (int i = 0; i < RandomPositiveNumbers1.length; i++) {
            RandomPositiveNumbers1[i] = (int) (Math.random() * 100);
            System.out.print(RandomPositiveNumbers1[i] + " ");
        }

        System.out.println("\nMethod 2");

        int[] RandomPositiveNumbers2 = new int[10];

        Random random = new Random();
        for (int i = 0; i < RandomPositiveNumbers2.length; i++) {
            RandomPositiveNumbers2[i] = random.nextInt(100);
            System.out.print(RandomPositiveNumbers2[i] + " ");
        }


        Common.part(3);

        Common.task("21");
//        Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
//        максимальное значение и среднее значение всех чисел массива.
//        Проверить работу метода на массиве из задания 20.

        int[] array21 = new int[] {1,4,7,99,-34,56};
        System.out.println(Arrays.toString(countArray(array21)));

                Common.task("22");
//        Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        int[] RandomPositiveNumbers22 = new int[10];
        int countEvenNumbers = 0;

        Random random22 = new Random();
        for (int i = 0; i < RandomPositiveNumbers22.length; i++) {
            RandomPositiveNumbers22[i] = random22.nextInt(100);
            if (RandomPositiveNumbers22[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        System.out.println(Arrays.toString(RandomPositiveNumbers22));
        System.out.println(countEvenNumbers);

        int[] evenNumbers = new int[countEvenNumbers];
        int cntEven = 0;
        for (int i = 0; i < RandomPositiveNumbers22.length; i++) {
            if (RandomPositiveNumbers22[i] % 2 == 0) {
                evenNumbers[cntEven] = RandomPositiveNumbers22[i];
                cntEven++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));

        int[] oddNumbers = new int[10 - countEvenNumbers];
        int cntOdd = 0;
        for (int i = 0; i < RandomPositiveNumbers22.length; i++) {
            if (RandomPositiveNumbers22[i] % 2 != 0) {
                oddNumbers[cntOdd] = RandomPositiveNumbers22[i];
                cntOdd++;
            }
        }
        System.out.println(Arrays.toString(oddNumbers));

        //        Common.Task("23");
//        Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//        Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        //        Common.Task("24");
//        Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        //        Common.Task("25");
//        Вывести сумму всех четных чисел массива из задания 24.

    }
}
