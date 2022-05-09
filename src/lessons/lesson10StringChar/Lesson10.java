package lessons.lesson10StringChar;

import utils.Utils;

import java.util.Arrays;
import java.util.Locale;

public class Lesson10 {

    public static void main (String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');

        System.out.println(a == aa);
        System.out.println(aa == aaa);
        System.out.println(aa.equals(aaa));

        String strA = "a";
//        System.out.println(a == strA); так сравнивать нельзя, т.к. это разные типы данных

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;

        System.out.println(str4);

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));
//        System.out.println(str1.charAt(4)); //StringIndexOutOfBoundsException

        for (int i = 0; i <= 4 ; i++) {
            System.out.println(str4.charAt(i));
        }

        Utils.line();

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println("Letter is not a");
            }
        }

        Utils.line();

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(i);
            } else {
                System.out.println("Letter is not a");
            }
        }

        Utils.line();

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) < 'i') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println(" >= i");
            }
        }

        Utils.line();

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) >= 'i') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println(" < i");
            }
        }

        Utils.line();

        System.out.println('i' - 1);
        System.out.println('i');
        System.out.println('i' + 1);

        Utils.line();

        System.out.println(Character.toString('i' - 1));
        System.out.println('i');
        System.out.println(Character.toString('i' + 1));

        Utils.line();

//        перевести строку в массив букв

        String[] arrayStr = new String[str4.length()];

        for (int i = 0; i < str4.length(); i++) {
            arrayStr[i] = Character.toString(str4.charAt(i));
        }
        System.out.println(Arrays.toString(arrayStr)); // массив, где каждая буква String
        System.out.println(str4.toCharArray()); // массив, где каждая буква char
        System.out.println(Arrays.toString(str4.toCharArray()));

        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0])));

        if (arrayStr[0].compareTo(Character.toString(arrayChar[0])) == 0) {
        }

        Utils.line();

        System.out.println(str4);
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());

        Utils.line();

        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5));




    }
}
