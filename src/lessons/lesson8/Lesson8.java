package lessons.lesson8;

import static utils.Utils.*;

public class Lesson8 {

    public static void main(String[] args) {

        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr = new int[6];
        int[] arr3 = new int[0];
        int[] arr4 = {};

        int[] arr5 = new int[1];
        int[] arr6 = {0};

        int[] arr7 = new int[3];
        int[] arr8 = {0, 0, 0};

        int a = 4;
        double b = 5.5;

        Integer intReg = 4;
        Integer intReg1 = 4;
        Double doubReg = 5.5;

//        Integer intObject = new Integer(4); // такой способ создания deprecated
//        Double doubObject = new Double(5.5);

        String str1 = "Hello!";
        String str2 = "Hello!";

        String strObject = new String("Hello!");

        System.out.println(str1 == str2);
        System.out.println(str1 == strObject);

        System.out.println("___________________________");

        System.out.println(intReg == intReg1);
//        System.out.println(intReg == intObject);

        System.out.println("___________________________");

        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = new String("Cat");

        System.out.println(cat1 == cat2); // тут сравниваем ссылки
        System.out.println(cat1 == cat3);
        System.out.println(cat3 == cat4);

        System.out.println("___________________________");

        System.out.println(cat1.equals(cat2)); // тут сравниваем значения
        System.out.println(cat1.equals(cat3));
        System.out.println(cat3.equals(cat4));

        System.out.println(intReg.equals(intReg1));

        line();
        verifyEquals(cat1, cat2);

        verifyEquals(intReg, intReg1);





    }




}
