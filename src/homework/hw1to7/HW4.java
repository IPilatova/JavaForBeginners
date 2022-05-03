package homework.hw1to7;

public class HW4 {

    static int number = 3;
    static String task = "Task";
    static String line1 = "\u001B[33m" + " ------------------ " + "\u001B[0m";
    static String sp = " ";

    public static void task() {
        System.out.println("\n" + line1 + "\u001B[34m" + task + sp + number + "\u001B[0m" + line1 + "\n");
        number++;
    }

    public static void divisionRemainder(String sA, String sB, int a, int b) {
        String result = "Результат деления ";
        String ostatok = ", а остаток от деления  = ";
        String na = " на ";
        String eq = " на ";
        int div = a / b;
        int rem = a % b;
        System.out.println(result + sA + na + sB + eq + div + ostatok + rem);
    }

    public static void appleStudent15(int apple, int student) {
        int div = apple / student;
        int rem = apple % student;
        System.out.println("Если " + apple + " яблок поделить на "
                + student + " учеников, то каждый ученик получит по "
                + div + " яблок(a), и " + rem + " яблок(а) останется учителю.");
    }

    public static void appleStudent16(int apple, int student) {
        int div = apple / student;
        int rem = apple % student;
        String text1 = "Если ";
        String text2 = " поделить на ";
        String text3 = ", то каждый ученик получит по ";
        String text4 = ", и ";
        String text5 = " останется учителю.";

        String comApples = "";
        if (apple % 10 == 1 && apple != 11) {
            comApples = " яблоко";
        } else if (apple >= 12 && apple <= 14) {
            comApples = " яблок";
        } else if (apple % 10 >= 2 && apple % 10 <= 4) {
            comApples = " яблока";
        } else {
            comApples = " яблок";
        }

        String divApples = "";
        if (div % 10 == 1 && div != 11) {
            divApples = " яблоку";
        } else if (div <= 12 && div <= 14) {
            divApples = " яблок";
        } else if (div % 10 >= 2 && div % 10 <= 4) {
            divApples = " яблока";
        } else {
            divApples = " яблок";
        }

        String remApples = "";
        if (rem % 10 == 1 && rem != 11) {
            remApples = " яблоко";
        } else if (rem >= 12 && rem <= 14) {
            remApples = " яблок";
        } else if (rem % 10 >= 2 && rem % 10 <= 4) {
            remApples = " яблока";
        } else {
            remApples = " яблок";
        }

        String students = "";
        if (student % 10 == 1 && student != 11) {
            students = " ученика";
        } else if (student >= 12 && student <= 14) {
            students = " учеников";
        } else if (student % 10 >= 2 && student % 10 <= 4) {
            students = " ученика";
        } else {
            students = " учеников";
        }

        System.out.println(text1 + apple + comApples + text2 + student + students
                + text3 + div + divApples + text4 + rem + remApples + text5);
    }

    public static void celsiusToFahrenheit(double Celsius) {
        double Fahrenheit = (9 / 5f) * Celsius + 32;

        String roundCelsius = String.format("%.1f", Celsius);
        String roundFahrenheit = String.format("%.1f", Fahrenheit);

        System.out.println("tC = " + roundCelsius + "\n" + "tF = " + roundFahrenheit);
    }

    public static void tableTask18(double i) {

//        Как автоматически считать ширину таблицы?

        String line = "------------------------";
        String pipe = "|";
        String cellEmpty = "\t\t\t\t\t\t";
        String cellData = sp + i + " ^ 2" + "\t\t\t\t";

        i = Math.pow(i, 2);
        String cellResult = sp + i + "\t\t\t\t\t";

        System.out.println(line + line);
        System.out.println(pipe + cellEmpty + pipe + cellEmpty + pipe);
        System.out.println(line + line);
        System.out.println(pipe + cellEmpty + pipe + cellEmpty + pipe);
        System.out.println(line + line);
        System.out.println(pipe + cellData + pipe + cellResult + pipe);
        System.out.println(line + line);
    }

    public static void digitShort(short d) {

        String result21 = "";

        if (Math.abs(d) > Short.MAX_VALUE) {
            result21 = "Число невалидное";
        } else if (Math.abs(d) / 10000 >= 1) {
            result21 = "It’s a five-digit number.";
        } else if (Math.abs(d) / 1000 >= 1) {
            result21 = "It’s a four-digit number.";
        } else if (Math.abs(d) / 100 >= 1) {
            result21 = "It’s a three-digit number.";
        } else if (Math.abs(d) / 10 >= 1) {
            result21 = "It’s a two-digit number.";
        } else {
            result21 = "It’s a one-digit number.";
        }

        System.out.println(result21);
    }

    public static void main(String[] args) {

//        Part 1

        System.out.println("_".repeat(10));

//        Task 3
        task();

        int a1 = 2;
        int b1 = 7;
        int c1 = 15;
        int d1 = 3;
        int e1 = 10;
        int f1 = 20;
        String tree1 = "Сосна";
        String tree2 = "Дуб";
        String tree3 = "Вишня";
        String tree4 = "Клён";
        String text1 = "Глаза даны, чтобы видеть";
        String text2 = "Под третьим этажом находится второй этаж";

        System.out.println((a1 == a1) && (b1 == b1));
        System.out.println(!(c1 < d1));
//        System.out.println((tree1 == tree2) || (tree3 == tree4));
        System.out.println(tree1.equals(tree2) || tree3.equals(tree4));
//        System.out.println(!(tree1 == tree2));
        System.out.println(!tree1.equals(tree2));
        System.out.println(!(c1 < d1) && (e1 > f1));
        System.out.println(text1.equals("Глаза даны, чтобы видеть")
                && text2.equals("Под третьим этажом находится второй этаж"));
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));

//        Task 4
        task();

//        ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        int minute = 60;
        String clock = "Показывают время";
        System.out.println(minute == 70 || clock == "Показывают время"); //true

//        !(28 > 7) И !(300/5 = 60);
        System.out.println(!(28 > 7) && !(300 / 5 == 60)); //false

//        ("Телевизор - электрический прибор") И ("Стекло - дерево");
        String TV = "электрический прибор";
        String glass = "не дерево";
        System.out.println(TV == "электрический прибор" && glass == "дерево"); //false

//        Не((300 < 100)) ИЛИ ("Жажду можно утолить водой");
        String drink = "можно утолить водой";
        System.out.println(!(300 < 100) || drink == "можно утолить водой"); //true

//        Не((300 < 100)) → ("Жажду можно утолить водой");
        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");
        } //true

//        (75 < 81) ИЛИ (88 = 88).
        System.out.println((75 < 81) || (88 == 88)); //true

        //        (75 < 81) → (88 = 88).
        int ee = 88;
        if ((75 < 81)) {
            System.out.println(ee == 88);
        } //true

//        Task 5
        task();

//        Андрей старше Светы. Наташа старше Светы.
        int ageAndrew = 15;
        int ageSveta = 5;
        int ageNatalie = 10;

        System.out.println(ageAndrew > ageSveta && ageNatalie > ageSveta);

        if (ageAndrew > ageSveta && ageNatalie > ageSveta) {
            System.out.println("Андрей старше Светы. Наташа старше Светы.");
        } else {
            System.out.println("");
        }

//        На полке стоят учебники, а на столе лежат справочники.
        String textbook = "стоят на полке";
        String helpbook = "лежат на столе";

        System.out.println(textbook == "стоят на полке" && helpbook == "лежат на столе");

        if (textbook == "стоят на полке") {
            System.out.println("На полке стоят учебники,");
        }
        if (helpbook == "лежат на столе") {
            System.out.println("а на столе лежат справочники");
        }

//        БОльшая часть детей — девочки. Остальные - мальчики.
        int numCommon = 50;
        int numGirl = 40;
        int numBoy;
        numBoy = numCommon - numGirl;

        System.out.println(numGirl > numBoy);

        if (numGirl > numCommon / 2 && numGirl > numBoy) {
            System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
        }

//        Task 6
        task();

        int age = 15;
        int limit = 16;

        if (age <= 0 || age >= 150) {
            System.out.println("\u001B[31m" + "Проверить возраст!!!" + "\u001B[0m");
        } else if (age >= limit) {
            System.out.println("Можно получить права");
        } else {
            System.out.println("Нельзя получить права");
        }

//        Task 7
        task();

        String condPetya1 = "едет в автобусе";
        String condPetya2 = "читает книгу";
        String condPetya3 = "смотрит в окно";

        Boolean condPetya = condPetya1 != "едет в автобусе"
                && ((condPetya2 == "читает книгу") || (condPetya3 != "смотрит в окно"));

        System.out.println(condPetya);

//        Task 8
        task();
//        Если с другом ты, это хорошо, а когда наоборот - плохо

        String meAndFriend = "together";
        String mood;

        if (meAndFriend.equals("together")) {
            mood = "good";
        } else {
            mood = "bad";
        }
        System.out.println(mood);

//        Task 9
        task();

//        Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age8 = -1;
        String human = "";

        if (age8 <= 0 || age8 >= 150) {
            human = "\u001B[31m" + "Проверить возраст!!!" + "\u001B[0m";
        } else if (age8 > 18) {
            human = "ты - взрослый";
        } else {
            human = "ты - ребенок";
        }
        System.out.println(human);

//        Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String ground81 = "сухая";
        String rain81 = "";

        if (ground81 == "сухая") {
            rain81 = "нет дождя";
        } else if (ground81 == "мокрая") {
            rain81 = "идет дождь";
        }
        System.out.println(rain81);

//        Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.

        String ground82 = "";
        String rain82;

        if (ground82 == "сухая") {
            rain82 = "нет дождя";
        } else if (ground82 == "мокрая") {
            rain82 = "идет дождь";
        } else {
            rain82 = "идет снег";
        }
        System.out.println(rain82);

//        Если на небе тучи, идет дождь, иначе идет “слепой” дождь.

        String sky83 = "";
        String rain83 = "";

        if (sky83 == "тучи") {
            rain82 = "идет дождь";
        } else {
            rain82 = "идет “слепой” дождь";
        }
        System.out.println(rain82);

//        Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье
        String today = "Friday";
        String tomorrow;
        String yesterday;

        if (today == "Saturday") {
            tomorrow = "Sunday";
            System.out.println(tomorrow);
        } else if (today == "Friday") {
            yesterday = "Thuersday";
            System.out.println(yesterday);
        } else {
            yesterday = "not Thuersday";
            tomorrow = "not Sunday";
            System.out.println(yesterday);
            System.out.println(tomorrow);
        }

//        Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String lobster = "whistled";
        String eternity;

        if (lobster == "whistled") {
            eternity = "passed";
        } else {
            eternity = "wait further";
        }

        System.out.println(eternity);

//        Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        String school = "finished";
        String result9 = "";
        int age9 = 5;

        if (age9 <= 0 || age9 > 150) {
            result9 = "\u001B[31m" + "Проверить возраст!!!" + "\u001B[0m";
        } else if (age9 >= 18 || school == "finished") {
            result9 = "ты можешь не жить с родителями";
        } else {
            result9 = "живи с родителями";
        }

        System.out.println(result9);

//        Part 2
//        Task 10 - conditional

        task();

        int n = 0; //2, 5, 0
        int expectedResult10 = 0;

        if (n % 2 == 0) {
            n = n * 2;
        } else {
            n = n * n;
        }

        System.out.println("actualResult = " + n);

//        Task 19

        if (expectedResult10 == n) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }


//        Task 11 - sequential
        task();

        int age11 = 149;
        String result11 = "";
        String expectedResult11 = "Можно идти в школу";

        System.out.println("Твой возраст - " + age11);

//        if (age11 >= 5) {
//            if (age11 >= 16) {
//                if (age11 >= 18) {
//                    result11 = "Можно голосовать";
//                    System.out.println(result11);
//                }
//                result11 = "Можно водить машину";
//                System.out.println(result11);
//            }
//            result11 = "Можно идти в школу";
//            System.out.println(result11);
//        } else if (age11 <= 0) {
//            result11 = "\u001B[31m" + "Проверить возраст!!!" +"\u001B[0m";
//            System.out.println(result11);
//        }

        if (age11 >= 5 && age11 < 21) {
            result11 = "Можно идти в школу";
            System.out.println(result11);
        } else if ((age11 > 0 && age11 < 5) || (age11 >= 21 && age11 < 150)) {
            result11 = "Возраст для школы не подходит";
            System.out.println(result11);
        }

        if (age11 >= 16 && age11 < 150) {
            result11 = "Можно водить машину";
            System.out.println(result11);
        } else if (age11 > 0 && age11 < 16) {
            result11 = "Нельзя водить машину";
            System.out.println(result11);
        }

        if (age11 >= 18 && age11 < 150) {
            result11 = "Можно голосовать";
            System.out.println(result11);
        } else if (age11 > 0 && age11 < 18) {
            result11 = "Нельзя голосовать";
            System.out.println(result11);
        }

        if (age11 <= 0 || age11 >= 150) {
            result11 = "\u001B[31m" + "Проверить возраст!!!" + "\u001B[0m";
            System.out.println(result11);
        }


//        Task 20

//        !!!Непонятно, как проверять несколько значений result11

//        Напишите алгоритм проверки возраста на соответствие условиям (if-else):
//        Голосовать можно с 18 лет
//        Машину можно водить с 16 лет
//        В школу можно идти с 5 лет

        if (expectedResult11 == result11) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

//        Task 12
        task();

        int grade = 3;
        String result12 = "";

        if (grade == 5) {
            result12 = "выдать похвальную грамоту и перевести в следующий класс";
        } else if (grade == 4) {
            result12 = "перевести в следующий класс";
        } else if (grade == 3) {
            result12 = "дать задание на лето и перевести в следующий клас";
        } else if (grade == 2) {
            result12 = "вызвать родителей и оставить в текущем классе на второй год";
        } else {
            result12 = "\u001B[31m" + "Проверить введенные данные!!!" + "\u001B[0m";
        }

        System.out.println("Оценка " + grade + " означает - " + result12);

//        Task 13
        task();

        int a13 = 30;
        int b13 = 0;
        int result13 = 0;

        System.out.println("Способ 1 - выводит первый из подходящих условию вариантов действий");
        System.out.println("-".repeat(20));

        if (a13 % 3 == 0 && b13 % 3 == 0) {
            result13 = a13 + b13;
        } else if (a13 % 5 == 0 && b13 % 5 == 0) {
            result13 = a13 - b13;
        } else if (a13 % 2 == 0 && b13 % 2 == 0) {
            result13 = a13 * b13;
            if (a13 < 0 || b13 < 0) {
                result13 = -1 * result13;
            }
        } else {
            System.out.println("\u001B[31m" + "Невозможно произвести действия!!!" + "\u001B[0m");
        }

        System.out.println("Результат = " + result13);

        System.out.println("-".repeat(20));
        System.out.println("Способ 2 - выводит все подходящие условию варианты действий");
        System.out.println("-".repeat(20));

        if (a13 % 3 == 0 && b13 % 3 == 0) {
            result13 = a13 + b13;
            System.out.println("Результат сложения = " + result13);
        }

        if (a13 % 5 == 0 && b13 % 5 == 0) {
            result13 = a13 - b13;
            System.out.println("Результат вычитания = " + result13);
        }

        if (a13 % 2 == 0 && b13 % 2 == 0) {
            if (a13 < 0 || b13 < 0) {
                result13 = -1 * a13 * b13;
                System.out.println("Результат умножения с учетом -1 = " + result13);
            } else {
                result13 = a13 * b13;
                System.out.println("Результат умножения = " + result13);
            }
        }

        if (a13 % 3 != 0 || b13 % 3 != 0){
            if (a13 % 5 != 0 || b13 % 5 != 0) {
                if (a13 % 2 != 0 || b13 % 2 != 0) {
                    System.out.println("\u001B[31m" + "Невозможно произвести действия!!!" + "\u001B[0m");
                }
            }
        }



//        Task 14
        task();

        divisionRemainder("k", "l", 5, 10);
        divisionRemainder("k", "m", 5, 15);
        divisionRemainder("l", "k", 10, 5);
        divisionRemainder("l", "m", 10, 15);
        divisionRemainder("m", "l", 15, 10);
        divisionRemainder("m", "k", 15, 5);


//        Task 15
        task();

        appleStudent15(40, 6);
        appleStudent15(100, 21);

//        Part 3
//        Task 16
        task();

        appleStudent16(40, 6);
        appleStudent16(100, 21);
        appleStudent16(42, 42);
        appleStudent16(55, 5);
        appleStudent16(1, 2);

//        Task 17
        task();

        celsiusToFahrenheit(36.6);

//        Task 18
        task();

        tableTask18(4);
        tableTask18(12);

//        Task 19
        task();
        System.out.println("см.под Task 10");

//        Task 20
        task();
        System.out.println("см.под Task 11");

//        Task 21
        task();

//        Способ 1 - ПРИОРИТЕТНЫЙ ВАРИАНТ
        short ddd = 1000;
        digitShort(ddd);

//        Способ 2
        digitShort((short) 1);

//        Способ 3

        short dd = 0;
        String result211 = "";

        if (Math.abs(dd) > Short.MAX_VALUE) {
            result211 = "Число невалидное";
        } else if (Math.abs(dd) / 10000 >= 1) {
            result211 = "It’s a five-digit number.";
        } else if (Math.abs(dd) / 1000 >= 1) {
            result211 = "It’s a four-digit number.";
        } else if (Math.abs(dd) / 100 >= 1) {
            result211 = "It’s a three-digit number.";
        } else if (Math.abs(dd) / 10 >= 1) {
            result211 = "It’s a two-digit number.";
        } else {
            result211 = "It’s a one-digit number.";
        }

        System.out.println(result211);
    }
}
