package homework.hw10;

import utils.Utils;
import java.util.Arrays;

public class HW10 {

//      Task 1
//      Написать метод, который принимает на вход строку.
//      Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
//      Догадаться, каким методом из видео можно проверить, были ли пробелы.
//      Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//      Если пробелов не было, вернуть сообщение “Пробелов не было”.
//      Если строка пустая, вернуть сообщение “Строка пустая”.
//      Test Data:
//            “    QA4Everyone   “ → “Лишние пробелы удалены”
//            “QA4Everyone“ → “Пробелов не было”
//            “” → “Строка пустая”

    public static String spaces (String str) {

        String strWithTrim;

        if (str.isEmpty()) {

            return "Line is empty";
        } else {
            strWithTrim = str.trim();
            if (str.equals(strWithTrim)) {

                return  "There were no spaces";
            } else {

                return "Extra spaces removed";
            }
        }
    }

//      Task 2
//      Написать алгоритм RemoveAll.
//      С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//      Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//      Метод возвращает обработанную строку.
//      Test Data:
//            “    QA4Everyone   “ →  “QA4Everyone“
//            “panda   “ → “pnd”

    public static String removeAll (String str) {

        if (str.isEmpty()) {

            return "0";
        } else {
            str = str.trim();
            str = str.replace("a","");

            return str;
        }
    }

//      Task 3
//      Написать алгоритм RemoveAllZeros.
//      С помощью методов из видео1,  написать алгоритм,
//      который принимает на вход строку, состоящую из цифр.
//      Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//      Метод возвращает обработанную строку, в которой нет нулей.
//      Test Data:
//            “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//            “ 0000000111“ → “111”

    public static String removeAllZeros (String str) {

        if (str.isEmpty()) {

            return "Line is Empty";
        } else {
            str = str.trim();
            str = str.replace(" ", "");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48  && str.charAt(i) <= 57) {
                    str = str.replace("0", "");

                } else {
                    return "Line is invalid";
                }
            }

            return str;
        }
    }








    public static void main(String[] args) {

        Utils.task(1);
        Utils.verifyEquals("Extra spaces removed", spaces("    QA4Everyone   "));
        Utils.verifyEquals("There were no spaces", spaces("QA4Everyone"));
        Utils.verifyEquals("Line is empty", spaces(""));

        Utils.task(2);
        Utils.verifyEquals("QA4Everyone", removeAll("    QA4Everyone   "));
        Utils.verifyEquals("pnd", removeAll("panda   "));

        Utils.task(3);
//        Utils.verifyEquals("35429764", removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
//        Utils.verifyEquals("111", removeAllZeros(" 0000000111"));
        Utils.verifyEquals("Line is invalid", removeAllZeros(" 0a000000111"));
//        Utils.verifyEquals("Line is Empty", removeAllZeros(""));

    }
}
