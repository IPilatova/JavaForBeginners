package homework.hw1to7;

public class HW2 {

    public static void main(String[] args) {

        System.out.println("Part 2");

        String line = "_________________________";
        int k = 5;
        int l = 10;
        int m = 15;

        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        int divKL = k / l;
        int divKM = k / m;
        int divLM = l / m;
        int divLK = l / k;
        int divMK = m / k;
        int divML = m / l;
        int remKL = k % l;
        int remKM = k % m;
        int remLM = l % m;
        int remLK = l % k;
        int remMK = m % k;
        int remML = m % l;
        String result = "Результат деления ";
        String ostatok = ", а остаток от деления  = ";
        String na = " на ";
        String sp = " ";
        String commaSp = ", ";

        /**         Task 12
         * Вывести значения переменных в столбик
         */
        System.out.println("Task 12");
        System.out.println(line);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

        /**         Task 13
         * Вывести значения переменных в строку
         */
        System.out.println("Task 13");
        System.out.println(line);
        System.out.println("Способ 1");
        System.out.println(k + sp + l + sp + m);
        System.out.println("Способ 2");
        System.out.print(k);
        System.out.print("\t");
        System.out.print(l);
        System.out.print("\t");
        System.out.println(m);
        System.out.println(line);

        /**         Task 14
         * Используя конкатенацию, вывести значения переменных в строку через запятую,чтобы было напечатано, например:
         * 5, 10, 15 или 8, 13, 113
          */
        System.out.println("Task 14");
        System.out.println(line);
        System.out.println(k + commaSp + l + commaSp + m);
        System.out.println(line);

        /**         Task 15
         * Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
         * Например, должно быть распечатано: int a = 5; или a = 5
         */
        System.out.println("Task 15");
        System.out.println(line);
        System.out.println("int k =  " + k + ";");
        System.out.println("int l = " + l + ";");
        System.out.println("int m = " + m + ";");
        System.out.println(line);

        /**         Task 16
         * Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
         * Sum of k and l = …
         * k * m = …
         * Разность переменных l и m = …
         */
        System.out.println("Task 16");
        System.out.println(line);
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + multKM);
        System.out.println("Разность переменных l и m = " + subLM);
        System.out.println(line);

        /**         Task 17
         * Распечатать следующие выражения:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         *
         * продолжить со всеми возможными вариантами
         */
        System.out.println("Task 17");
        System.out.println(line);
        System.out.println(result + "k" + na + "l = " + divKL + ostatok + remKL);
        System.out.println(result + "k" + na + "m = " + divKM + ostatok + remKM);
        System.out.println(result + "l" + na + "m = " + divLM + ostatok + remLM);
        System.out.println(result + "l" + na + "k = " + divLK + ostatok + remLK);
        System.out.println(result + "m" + na + "k = " + divMK + ostatok + remMK);
        System.out.println(result + "m" + na + "l = " + divML + ostatok + remML);
        System.out.println(line);

        /**         Task 18
         * Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
         * Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         *
         * Распечатать это же выражение со значениями 100 и 21.
         */
        System.out.println("Task 18");
        System.out.println(line);

        int apple = 40;
        int student = 6;
        int divAppleStudent = apple / student;
        int remAppleStudent = apple % student;
        String text1 = "Если ";
        String text2 = " яблок поделить на ";
        String text3 = " учеников, то каждый ученик получит по ";
        String text4 = " яблок(a), и ";
        String text5 = " яблок(а) останется учителю.";

        System.out.println(text1 + apple + text2 + student + text3 + divAppleStudent + text4 + remAppleStudent + text5);

        apple = 100;
        student = 21;
        divAppleStudent = apple / student;
        remAppleStudent = apple % student;
        System.out.println(text1 + apple + text2 + student + text3 + divAppleStudent + text4 + remAppleStudent + text5);
        System.out.println(line);

        /**         Task 19
         * Распечатать вычисления и итоговый результат:
         * Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …
         */
        System.out.println("Task 19");
        System.out.println("РАЗБОР!!!");

        System.out.println(line);

        // считаем сумму, которую по заданию нужно рассчитать
        int sumKLM = k + l + m;
        int sumLKM = l + k + m;

        // задаем m++ и проверяем значение до и после
        System.out.println(m);
        m++;
        System.out.println(m);

        // задаем sumKLM-- и проверяем значение до и после
        System.out.println(sumKLM);
        sumKLM--;
        System.out.println(sumKLM);

        // выводим в переменные итоговое расчеты из задачи и проверяем, чему они равны
        int sumCommon = k + l + m + sumKLM;
        System.out.println(sumCommon);
        int subs = m - sumLKM;
        System.out.println(subs);

        // Выводим итог
        // Способ 1
        System.out.println("Сложение суммы чисел k + l + m++ = " + (k + l + m) + " и sumKLM-- = " + sumKLM + " равно "
                + (k + l + m + sumKLM) + ", а разность m++ = " + m + " и  sumLKM = " + sumLKM
                + " равно " + (m - sumLKM));

        // Способ 2
        System.out.println("Сложение суммы чисел k + l + m++ и sumKLM-- = " + sumCommon
                + ", а разность m++ и sumLKM = " + subs);
        System.out.println(line);


        /**         Task 20
         * Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
         */

        System.out.println("Task 20");
        System.out.println(line);
        System.out.println("48 кратно 8");
        System.out.println("При делении 48 на 8 остаток равен " + 48 % 8);
        System.out.println(line);

        System.out.println("48 и 8 - четные");
        System.out.println("При делении 48 на 2 остаток равен " + 48 % 2);
        System.out.println("При делении 8 на 2 остаток равен " + 8 % 2);
        System.out.println(line);

        System.out.println("47 и 49 - нечетные");
        System.out.println("При делении 47 на 2 остаток равен " + 47 % 2);
        System.out.println("При делении 49 на 2 остаток равен " + 49 % 2);
        System.out.println(line);
        System.out.println(line);

        /**         Part 3
         * Для всех заданий:
         * x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
         * a. Вывести на печать математическое выражение из заданий 21, 22 и 23
         * b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
         * result21, result22 и result23 - результаты вычислений в каждом выражении
         * (считать с помощью программы, а не вручную!)
         */
        System.out.println("Part 3");
        System.out.println(line);
        System.out.println(line);


        k = 5;
        l = 10;
        m = 15;

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);
        System.out.println(result21);

        int result22 = (3 + 4 * x) / 5 - (10 * (y - 5) * (a + b + c)) / x + 9 * (4 / x + (9 + x) / y);
        System.out.println(result22);

        int result23 = ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/(x + y));
        System.out.println(result23);

        System.out.println(line);

        System.out.println("| task \t| " + "result \t\t|");
        System.out.println(line);
        System.out.println("| 21 \t| " + result21 + "\t\t\t|");
        System.out.println(line);
        System.out.println("| 22 \t| " + result22 + "\t\t\t|");
        System.out.println(line);
    }
}
