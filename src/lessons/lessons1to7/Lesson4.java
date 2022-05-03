package lessons.lessons1to7;

public class Lesson4 {

    static int number = 1;

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printLine() {
        System.out.println("___________________________");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task() {
        printEmptyLine();
        printLine();
        System.out.println("Task " + number);
        printLine();

        number++;
    }

    public static void main(String[] args) {

//        Task 1
        task();
//         Квадрат  - это !круг.

        String square = "Square";
        String circle = "Circle";

        System.out.println(square != circle);

//        Task 2
        task();
//        Если сегодня суббота, значит, завтра воскресенье.

//        version 1

        String today = "Saturday";

        if (today == "Saturday") {
            String tomorrow1 = "Sunday";
            System.out.println(tomorrow1);
        }

//        version 2

        String tomorrow2 = "Sunday";

        if (today == "Saturday") {
            System.out.println(tomorrow2);
        }

//        version 3

        String tomorrow3;

        if (today == "Saturday") {
            tomorrow3 = "Sunday";
            System.out.println((tomorrow3));
        }

//        Task 3
        task();
//      Если a > b или b < c, то присвоить a значание 7, и сложить  b и c,
//      иначе присвоить а значение 10

        int a = 9;
        int b = 12;
        int c = 22;

        if (a > b || b < c) {
            a = 7;
            int sum = b + c;

            System.out.println(a + " " + sum);
        } else {
            a = 10;

            System.out.println(a);
        }

//        Task 4
        task();
        print("Hello!");
        print(tomorrow2);

//        Task 5
        task();

        int n = 0;
        int expectedResult = 0;

//        Если число нечетное и кратно трем

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println("actualResult = " + n);
        System.out.println("expectedResult = " + expectedResult);

//        Тест
        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }




//        public static final String ANSI_RESET = "\u001B[0m";
//        public static final String ANSI_BLACK = "\u001B[30m";
//        public static final String ANSI_RED = "\u001B[31m";
//        public static final String ANSI_GREEN = "\u001B[32m";
//        public static final String ANSI_YELLOW = "\u001B[33m";
//        public static final String ANSI_BLUE = "\u001B[34m";
//        public static final String ANSI_PURPLE = "\u001B[35m";
//        public static final String ANSI_CYAN = "\u001B[36m";
//        public static final String ANSI_WHITE = "\u001B[37m";









    }






}
