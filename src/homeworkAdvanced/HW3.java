package homeworkAdvanced;

public class HW3 {

    public static void main(String[] args) {

        Common.task("3.1.1");

        int a = 6;
        int b = 6;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

        Common.task("3.1.2");

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        Common.task("3.1.3");

        int c = 300;

        if (c > 10) {
            System.out.println("больше 10");
        }
        if (c < 100) {
            System.out.println("меньше 100");
        }
        if ((c / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (c >= 5 && c <=40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        Common.task("3.2.1");

        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        Common.task("3.2.2");

        for (int i = 5; i < 10001; i = i * 5) {
            System.out.println(i);
        }

        Common.task("3.2.3");

//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//
//
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).

        System.out.println("Способ 1");
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nСпособ 2");
        for (int i = 40; i < 61; i = i + 4) {
            System.out.println(i);
        }







    }


}
