package lessons.lessons1to7;

public class Lesson5 {

    public static int returnMinOfThree(int number1, int number2, int number3) {
        int min;

        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }

            return min;
    }

    public static double returnAverageOfThree(int number1, int number2, int number3) {

        double average = ((double)number1 + number2 + number3) / 3;

        return (average);

//        а можно сделать все в одной строчке:
//        return (((double)number1 + number2 + number3) / 3);
    }

    public static double returnAbs(double number) {
        if (number < 0) {
            number = (-1) * number;
        }

        return (number);
    }

    public static double countDifferenceBetweenMinAndAverage (int number1, int number2, int number3) {

        int min = returnMinOfThree(number1, number2, number3);
        double average = returnAverageOfThree(number1, number2, number3);

        return returnAbs(min - average);

//        также можно расписать внутри этого метода расчет абс.значения

//        double difference = min - average;
//
//        if (difference < 0) {
//            difference = (-1) * difference;
//        }
//
//        return difference;
    }

    public static String displayMessage (int number1, int number2, int number3) {

        String message;

        if (countDifferenceBetweenMinAndAverage(number1, number2, number3) > 3.51) {
            message = "Большой разброс чисел";
        } else {
            message = "Маленький разброс чисел";
        }

        System.out.println(message);
        return (message);
    }

//    если ничего не возвращаем, а только выводим результат на печать, то используем return type = void
//
//    public static void displayMessage (int number1, int number2, int number3) {
//        if (countDifferenceBetweenMinAndAverage(number1, number2, number3) > 3.51) {
//            System.out.println("Большой разброс чисел");
//        } else {
//            System.out.println("Маленький разброс чисел");
//        }
//    }





    public static void main(String[] args) {

        // Даны 3 числа.
        // Необходимо найти максимально точную разницу
        // между минимальным числом и средним значением.
        // Если разница больше 3.51,
        // показать пользователю сообщение "Большой разброс чисел",
        // иначе показать сообщение "Маленький разброс чисел"

        int a = 5;
        int b = 2;
        int c = 10;

        System.out.println(returnMinOfThree(a, b, c));
        System.out.println(returnAverageOfThree(a, b, c));

        displayMessage(a, b, c);


    }

}
