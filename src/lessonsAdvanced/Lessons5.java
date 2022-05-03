package lessonsAdvanced;

import utils.Common;

public class Lessons5 {

    public static void main(String[] args) {

        Test5 t = new Test5(); //  Тип Test5 - переменная t - Объект типа Test5 (с именем типа Test5)
        // т.е. создал Объект типа Test5 и поместил его в переменную t
        // создан экземпляр класса


        int x = 5;
        int y = 6;
        t.sum(x, y);

        Common.line();

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                break; // "волшебное слово", которое прерывает цикл
            }

            System.out.println(i);
        }

        Common.line();

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                continue; // "волшебное слово", которое прерывает итерацию. После него заканчиваем итерацию и переходим
                          // к следующему шагу
            }

            System.out.println(i);
        }

        Common.line();

//        Методы
        System.out.println("Methods");

        Common.line();

        String str = "Hi!";
        System.out.println(str.indexOf("!"));

        Common.line();


    }


}
