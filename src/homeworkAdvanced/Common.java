package homeworkAdvanced;

public class Common {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String LineStar(int countStarInLine) {

        String lineStar;
        lineStar = ANSI_YELLOW + "-".repeat(countStarInLine) + ANSI_RESET;

        return lineStar;
    }

    public static void task(String num) {
        System.out.println("\n" + LineStar(20) + ANSI_BLUE + " Task " + num + " " + ANSI_RESET
                + LineStar(20));
    }

    public static void PrintTestResult(String num) {
        System.out.println("\n" + ANSI_PURPLE + "Test for Task " + num + ":" + ANSI_RESET);
    }
}
