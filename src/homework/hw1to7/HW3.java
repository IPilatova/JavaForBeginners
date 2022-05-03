package homework.hw1to7;

public class HW3 {

    public static void main(String [] args) {

        String line = "_______________________________";
        String lineTable1 = "_________________________________________________";
        String lineTable2 = "_________________________________________________________";
        String task = "Task ";
        int n;
        n = 2;

        String sp = " ";
        String commaSp = ", ";
        String spEqSp = " = ";
        String spMinusSp = " - ";
        String sc = ";";
        String pipe = "|";
        String pipeDouble = "||";

        String By = "Byte";
        String Sh = "Short";
        String In = "Int";
        String Lo = "Long";
        String Fl = "Float";
        String Db = "Double";

        String num_1 = "num1";
        String num_2 = "num2";
        String number_1 = "number1";
        String number_2 = "number2";
        String part1 = "Если";
        String part2 = ", то результат сравнения методом ";
        String part3 = ".equals";


//        Part 1

//        Task 2
        
        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        byte a;
        byte b;

//        System.out.println(Byte.MIN_VALUE); -128
//        System.out.println(Byte.MAX_VALUE); 127

        a = 30;
        b = 127;

        System.out.println("a" + spEqSp + a + sc);
        System.out.println("b" + spEqSp + b + sc);

//        Task 3

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        short s;
        short t;

//        System.out.println(Short.MIN_VALUE); -32768
//        System.out.println(Short.MAX_VALUE); 32767

//        s = -30001;
//        t = (short) (s + 60000);

        s = Short.MAX_VALUE;
        t = (short) (s - 60000);

        System.out.println("s" + spEqSp + s + sc);
        System.out.println("t" + spEqSp + t + sc);

        System.out.println("Разница" + spEqSp + Short.compare(s, t) + sc);

//        Task 4

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        int i;
        i = Integer.MIN_VALUE;
        int min = i;

        i = Integer.MAX_VALUE;
        int max = i;

        System.out.println(line);
        System.out.println("| int min\t| " + min + "\t|");
        System.out.println(line);
        System.out.println("| int max\t| " + max + "\t|");
        System.out.println(line);

//        i = Integer.MIN_VALUE;
//
//        System.out.println(line);
//        System.out.println("| int min\t| " + i + "\t|");
//        System.out.println(line);
//
//        i = Integer.MAX_VALUE;
//
//        System.out.println("| int max\t| " + i + "\t|");
//        System.out.println(line);

//        Task 5

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        long phoneNumber;
        phoneNumber = 18009998877L;

        System.out.println("phoneNumber" + spEqSp + phoneNumber + sc);

//        Task 6

//        *************** Почему в f выводится другое число?

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        float f;
        f = 100.101101F;
        System.out.println(f);

        double d;
        d = 100.101101;
        System.out.println(d);

        System.out.println(lineTable2);
        System.out.println(pipe + sp + Float.TYPE + sp + "f" + spEqSp + f + "\t\t\t" + pipeDouble + sp + f + "\t\t\t" + pipe);
        System.out.println(lineTable2);
        System.out.println(pipe + sp + Double.TYPE + sp + "d" + spEqSp + d + "\t\t\t" + pipeDouble + sp + d + "\t\t\t" + pipe);
        System.out.println(lineTable2);

//        Task 7

//        *************** Почему сумма не совпадает?

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Double dd;
        dd = Double.sum(10.09999, 20.099999);
//        System.out.println(dd);

        Float ff;
        ff = Float.sum(10.09999F, 20.099999F);
//        System.out.println(ff);

        System.out.println(lineTable2);
        System.out.println(pipe + sp + Float.TYPE + spEqSp + 100.101101 + "\t\t\t" + pipeDouble + sp + f + "\t\t\t" + pipe);
        System.out.println(lineTable2);
        System.out.println(pipe + sp + Double.TYPE + spEqSp + 100.101101 + "\t\t\t" + pipeDouble + sp + d + "\t\t\t" + pipe);
        System.out.println(lineTable2);
        System.out.println(pipe + sp + Fl + spEqSp + "10.09999 + 20.099999" + "\t"
                + pipeDouble + sp + ff + "\t\t\t\t" + pipe);
        System.out.println(lineTable2);
        System.out.println(pipe + sp + Db + spEqSp + "10.09999 + 20.099999" + "\t"
                + pipeDouble + sp + dd + "\t" + pipe);
        System.out.println(lineTable2);

//        Task 8

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        double result;
        result = 10.0 / 3;
        System.out.println("result\t" + spEqSp + result + sc);

        double result1;
        result1 = ((double)10) / 3;
        System.out.println("result2\t" + spEqSp + result1 + sc);

        double result2;
        result2 = 10 / 3d;
        System.out.println("result3\t" + spEqSp + result2 + sc);

        double result4;
        result4 = 10 * 0.1 / 3;
        System.out.println("result4\t" + spEqSp + result4 + sc);

//        Task 9

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        double sum;
        sum = f + d;

        double product;
        product = f * d;

        double quotient;
        quotient = f / d;

        double remainder;
        remainder = f % d;

        System.out.println("sum\t\t\t " + spEqSp + sum  + sc);
        System.out.println("product\t\t " + spEqSp + product  + sc);
        System.out.println("quotient\t " + spEqSp + quotient  + sc);
        System.out.println("remainder\t " + spEqSp + remainder  + sc);

//        Task 10

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        String dot1sss = ".   ";
        String dot1111 = "....";
        String dot1ss1 = ".  .";
        String tab = "\t";

        String line24 = dot1ss1 + tab + dot1sss + tab + dot1sss + tab + dot1sss + tab + dot1ss1;

        System.out.println(dot1ss1 + tab + dot1111 + tab + dot1sss + tab + dot1sss + tab + dot1111);
        System.out.println(line24);
        System.out.println(dot1111 + tab + dot1111 + tab + dot1sss + tab + dot1sss + tab + dot1ss1);
        System.out.println(line24);
        System.out.println(dot1ss1 + tab + dot1111 + tab + dot1111 + tab + dot1111 + tab + dot1111);


//        Part 2
//        Task 11

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100; // 2147483648
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = -1000000.001;
        Short t9 = 1010;

        System.out.println(By + spEqSp + t1 + sc);
        System.out.println(Sh + spEqSp + t2 + sc);
        System.out.println(By + spEqSp + t3 + sc);
        System.out.println(Fl + spEqSp + t4 + sc);
        System.out.println(In + spEqSp + t5 + sc);
        System.out.println(Lo + spEqSp + t6 + sc);
        System.out.println(Db + spEqSp + t7 + sc);
        System.out.println(Db + spEqSp + t8 + sc);
        System.out.println(Sh + spEqSp + t9 + sc);

//        Task 12

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        String lineTable12 = "_____________________________________________________________________________________";

        System.out.println(lineTable12);
        System.out.println(
                        pipe + sp + "Type" + tab + tab
                        + pipeDouble + sp + "Size in bits" + tab + tab
                        + pipeDouble + sp + "min" + tab + tab + tab + tab + tab
                        + pipeDouble + sp + "max" + tab + tab + tab + tab + tab + tab
                        + pipe
        );
        System.out.println(lineTable12);
        System.out.println(
                        pipe + sp + Byte.TYPE + tab + tab
                        + pipeDouble + sp + Byte.BYTES + tab + tab + tab + tab
                        + pipeDouble + sp + Byte.MIN_VALUE + tab + tab + tab + tab + tab
                        + pipeDouble + sp + Byte.MAX_VALUE + tab + tab + tab + tab + tab + tab
                        + pipe
        );
        System.out.println(lineTable12);
        System.out.println(
                pipe + sp + Short.TYPE + tab + tab
                        + pipeDouble + sp + Short.BYTES + tab + tab + tab + tab
                        + pipeDouble + sp + Short.MIN_VALUE + tab + tab + tab + tab
                        + pipeDouble + sp + Short.MAX_VALUE + tab + tab + tab + tab + tab
                        + pipe
        );
        System.out.println(lineTable12);
        System.out.println(
                pipe + sp + Integer.TYPE + tab + tab
                        + pipeDouble + sp + Integer.BYTES + tab + tab + tab + tab
                        + pipeDouble + sp + Integer.MIN_VALUE + tab + tab + tab
                        + pipeDouble + sp + Integer.MAX_VALUE + tab + tab + tab + tab
                        + pipe
        );
        System.out.println(lineTable12);
        System.out.println(
                pipe + sp + Long.TYPE + tab + tab
                        + pipeDouble + sp + Long.BYTES + tab + tab + tab + tab
                        + pipeDouble + sp + Long.MIN_VALUE + tab
                        + pipeDouble + sp + Long.MAX_VALUE + tab + tab
                        + pipe
        );
        System.out.println(lineTable12);
        System.out.println(
                pipe + sp + Float.TYPE + tab + tab
                        + pipeDouble + sp + Float.BYTES + tab + tab + tab + tab
                        + pipeDouble + sp + Float.MIN_VALUE + tab + tab + tab + tab
                        + pipeDouble + sp + Float.MAX_VALUE + tab + tab + tab + tab
                        + pipe
        );
        System.out.println(lineTable12);
        System.out.println(
                pipe + sp + Double.TYPE + tab
                        + pipeDouble + sp + Double.BYTES + tab + tab + tab + tab
                        + pipeDouble + sp + Double.MIN_VALUE + tab + tab + tab + tab
                        + pipeDouble + sp + Double.MAX_VALUE + tab
                        + pipe
        );
        System.out.println(lineTable12);

//        Task 13

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Integer num1;
        Integer num2;
        num1 = 200;
        num2 = 200;

        boolean result13 = num1.equals(num2);
        System.out.println(part1 + sp + num_1 + spEqSp + num_2 + part2 + part3 + spEqSp
                + result13 + sc);

        num2 = -200;
        result13 = num1.equals(num2);
        System.out.println(part1 + sp + num_1 + sp + "не равно" + sp + num_2 + part2 + part3 + spEqSp
                + result13 + sc);

//        Task 14

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        String intCompare = ".compare";

        int number1;
        int number2;

//        а) number1 = number2

        number1 = 150;
        number2 = 150;

        System.out.println(part1 + sp + number_1 + spEqSp + number_2 + part2 + intCompare
                + spEqSp + Integer.compare(number1, number2) + sc);

//        б) number1 < number2

        number2 = 200;

        System.out.println(part1 + sp + number_1 + sp +  "<" + sp + number_2 + part2 + intCompare
                + spEqSp + Integer.compare(number1, number2) + sc);

//        в) number1 > number2

        number2 = 100;

        System.out.println(part1 + sp + number_1 + sp +  ">" + sp + number_2 + part2 + intCompare
                + spEqSp + Integer.compare(number1, number2) + sc);

//        Task 15

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Float task15 = 234.9999F;

        System.out.println("Переменная типа Float в int = " + task15.intValue() + sc);

//        Task 16

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        double aTask16 = 111.11111;
        double bTask16 = 222.123456;

        System.out.println("Сумма двух переменных типа double = " + Double.sum(aTask16, bTask16) + sc);

//        Task 17

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Float aTask17 = 234.9999F;
        Float bTask17 = -100.1234F;

        System.out.println("Сумма двух переменных типа Float = "
                + Integer.sum(aTask17.intValue(), bTask17.intValue()) + sc);

//        Task 18

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

//        а) short1 = 12000

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println(short1 + spMinusSp + short2 + spEqSp + short1.compareTo(short2) + sc);
//        System.out.println(short1 + spMinusSp + short2 + spEqSp + Short.compare(short1,short2) + sc);

//        б) short1 = 12500

        short1 = 12500;

        System.out.println(short1 + spMinusSp + short2 + spEqSp + short1.compareTo(short2) + sc);

//        Task 19

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

//        System.out.println("Результат doub1 - doub2 = " + Double.sum(doub1, -doub2) + sc);
        System.out.println("Результат doub1 - doub2 = " + (doub1 - doub2) + sc);
        System.out.println("Результат str1 - str2 = " + (Double.parseDouble(str1) - Double.parseDouble(str2)) + sc);

//        Task 20

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Float tempC;

//        Float tempMaxC = 38.2F;
//        Float tempMinC = 35.4F;
//
//        System.out.println("Среднее значение температуры тела кота = "
//                + Math.round(Float.sum(tempMaxC, tempMinC) / 2) + "C" + sc);

        Float avarage;
        tempC = 38.2F;
        avarage = tempC / 2;
        tempC = 35.4F;
        avarage = avarage + tempC / 2;

        System.out.println("Среднее значение температуры тела кота = "
                + Math.round(avarage) + "C" + sc);

//        Part 3
//        Task 21

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Number nn;
        String val = "n";

        System.out.println("Переменная " + val + " может принимать значения: ");

        nn = Long.MAX_VALUE;
        System.out.println(val + spEqSp + nn + sc);

        nn = 10;
        System.out.println(val + spEqSp + nn + sc);

        nn = 10.999999999;
        System.out.println(val + spEqSp + nn + sc);

        System.out.println("Это возможно, потому что тип Number является суперклассом (родительским классом)\n"
                + "для числовых типов данных, у которого есть свойства всех детей");

//        Task 22

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        Integer numberInteger = 100;
        System.out.println("Способ 1\n");

        System.out.println("numberInteger имеет тип Integer, так как "
                + "при сложении двух значений (100 + 100) получим сумму: "
                + (numberInteger + numberInteger) + sc);
        System.out.println("numberInteger.toString() имеет тип String, так как "
                + "при сложении двух значений (100 + 100) получим конкатенацию: "
                + numberInteger.toString() + numberInteger.toString() + sc);

        System.out.println("\nСпособ 2\n");

        System.out.println("numberInteger имеет класс: " + numberInteger.getClass());
        System.out.println("numberInteger.toString() имеет класс: " + numberInteger.toString().getClass());

//        Task 23

        System.out.println("\n------------------ " + (task + n++) +" ------------------\n");

        double tC = 36.6;
        double tF;
        double kg1 = 50.0;
        double lb1;
        double lb2 = 50.0;
        double kg2;

        tF = (9 / 5f) * tC + 32;
        String textC = " градусов по Цельсию  = ";
        String textF = " градусов по Фаренгейту, где значение по Фаренгейту должно быть вычислено по формуле: "
                + "tF = (9 / 5) * tC + 32";

        System.out.println(tC + textC + tF + textF + sc);

        lb1 = 2.20462 * kg1;
        kg2 = 0.4535923745 * lb2;
        String kgToLb1 = " kilogram = ";
        String kgToLb2 = " lbs,  ";
        String kgToLb3 = " lb = ";
        String kgToLb4 = " kg, где значения должны быть вычислены по формулам: "
                + "lb1 = 2.20462 * kg1 и kg2 = 0.4535923745 * lb2";

        System.out.println(kg1 + kgToLb1 + lb1 + kgToLb2 + lb2 + kgToLb3 + kg2 + kgToLb4 + sc);
    }
}
