package homework.hw1to7;

import utils.Common;

public class HW5 {

    public static void verifyEquals(int expectedResult, int actualResult) {

        if (expectedResult == actualResult) {
            Common.pass();
        } else {
            Common.fail();
        }
    }

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {
            Common.pass();
        } else {
            Common.fail();
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            Common.pass();
        } else {
            Common.fail();
        }
    }

    public static String returnDayOfWeek(int numberOfWeek) {

        String dayOfWeek;

        if (numberOfWeek < 1 || numberOfWeek > 7) {
            dayOfWeek = "Incorrect data";
        } else if (numberOfWeek == 1) {
            dayOfWeek = "Monday";
        } else if (numberOfWeek == 2) {
            dayOfWeek = "Tuesday";
        } else if (numberOfWeek == 3) {
            dayOfWeek = "Wednesday";
        } else if (numberOfWeek == 4) {
            dayOfWeek = "Thursday";
        } else if (numberOfWeek == 5) {
            dayOfWeek = "Friday";
        } else if (numberOfWeek == 6) {
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = "Sunday";
        }

        return dayOfWeek;
    }

    public static int maxValueOfTree1(int x, int y, int z) {
        int largest = 0;
        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest < z) {
            largest = z;
        }

        return largest;
    }

    public static int maxValueOfTree2(int x, int y, int z) {
        int largest = 0;
        if (x > y) {
            largest = x;
            if (z > largest) {
                largest = z;
            }
        } else if (y > x) {
            largest = y;
            if (z > largest) {
                largest = z;
            }
        }
        return largest;
    }

    public static int minValueOfThree1(int x, int y, int z) {
        int smallest = 0;
        smallest = Math.min(Math.min(x, y), z);

        return smallest;
    }

    public static int minValueOfThree2(int x, int y, int z) {
        int smallest = 0;
        if (x < y) {
            smallest = x;
            if (z < smallest) {
                smallest = z;
            }
        } else {
            smallest = y;
            if (z < smallest) {
                smallest = z;
            }
        }

        return smallest;
    }

    public static double averageTempOfCat(double temp1, double temp2, double temp3, double temp4, double temp5) {
        double average = 0.0;
        average = (temp1 + temp2 + temp3 + temp4 + temp5) / 5;

        return average;
    }

    public static String priceToString(double priceForOneItem) {
        String price = "";
        int wholePart = (int) Math.floor(priceForOneItem);
        int fractionPart = (int) ((priceForOneItem - wholePart) * 100);
        price = wholePart + " руб " + fractionPart + " коп";

        if (priceForOneItem <= 0) {

            return "Введите корректную цену";
        }

        return price;
    }

    public static void main(String[] args) {

//        Task 1
        Common.task();
        Common.printTestResult();

//        Task 2
        Common.task();
        System.out.println(returnDayOfWeek(1));

        Common.printTestResult();
        verifyEquals("Monday", returnDayOfWeek(1));
        verifyEquals("Monday", returnDayOfWeek(8));
        verifyEquals("Sunday", returnDayOfWeek(7));

//        Task 3
        Common.task();
        System.out.println(maxValueOfTree1(1, 2, 3));
        System.out.println(maxValueOfTree2(-30, 20, 100));

        Common.printTestResult();
        verifyEquals(3, maxValueOfTree1(1, 2, 3));
        verifyEquals(4, maxValueOfTree1(1, 2, 3));
        verifyEquals(1, maxValueOfTree1(1, 2, 3));

//        Task 4
        Common.task();
        System.out.println(minValueOfThree1(-3299,0,3299));
        System.out.println(minValueOfThree2(9, 4, 3));

        Common.printTestResult();
        verifyEquals(-3, minValueOfThree1(100,0, -3));
        verifyEquals(3, minValueOfThree1(-100,0, 3));

//        Task 5
        Common.task();
        System.out.println(averageTempOfCat(36.7, 35, 40, 34, 37.8));

        Common.printTestResult();
        verifyEquals(36.58, averageTempOfCat(36.7, 35, 39.4, 34, 37.8));
        verifyEquals(36.5, averageTempOfCat(36.7, 35, 39.4, 34, 37.8));


//        Task 6
        Common.task();
        System.out.println(priceToString(0));

        Common.printTestResult();
        verifyEquals("10 руб 75 коп", priceToString(10.75));
        verifyEquals("Введите корректную цену", priceToString(-10.55));
        verifyEquals("0 руб 0 коп", priceToString(0));
    }
}
