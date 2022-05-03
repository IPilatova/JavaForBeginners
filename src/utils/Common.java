package utils;

public class Common {

    public static int numTask = 1;
    public static String result = "";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void line() {
        System.out.println(ANSI_YELLOW + "-".repeat(30) + ANSI_RESET);
    }

    public static String line(int countElementsInLine) {

        String lineStar;
        lineStar = ANSI_YELLOW + "-".repeat(countElementsInLine) + ANSI_RESET;

        return lineStar;
    }

    public static void task(String num) {
        System.out.println("\n" + line(20) + ANSI_BLUE + " Task " + num + " " + ANSI_RESET + line(20));
    }

    public static void task() {
        System.out.println("\n" + line(20) + ANSI_BLUE + " Task " + numTask + " " + ANSI_RESET + line(20));
    }

    public static void part(int num) {
        System.out.println(ANSI_BLUE + "\n\n" + "=".repeat(20) + "\nPart " + num + "\n" + "=".repeat(20) + ANSI_RESET);

    }

    public static void printTestResult() {
        System.out.println("\n" + ANSI_PURPLE + "Test for Task " + numTask + ":" + ANSI_RESET);
        numTask++;
    }

    public static void pass() {
        result = "Pass";
        System.out.println(ANSI_GREEN + result + ANSI_RESET);
    }

    public static void fail() {
        result = "Fail";
        System.out.println(ANSI_RED + result + ANSI_RESET);
    }

}
