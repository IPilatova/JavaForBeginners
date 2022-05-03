package homework.hw1to7;

public class HW1 {

    public static void main(String[] args) {

        //В классе homework.homework1to7.HW1 создать две переменные a и b типа int и присвоить им значения 10 и 20 coответственно
        int a = 10;
        int b = 20;

        //Cоздать целочисленную переменную s, и присвоить ей значение 100
        int s = 100;

        //Cоздать целочисленную переменную t, и присвоить ей значение переменной s
        int t = s;

        //В классе homework.homework1to7.HW1 создать переменную myNameInSlack и присвоить ей соответствующее значение
        String myNameInSlack = "Irina Pilatova";

        System.out.println(myNameInSlack);

        //В классе lessons.school.Person создать переменную yob (year of birth), присвоить ей значение (например, 1990)
        int yob;
        yob = 1990;

        //вывести на печать сообщение:
        //“Если человек родился в 1990 году, то его возраст - разница между 2020 и 1990”.
        String phrase1 = "Если человек родился в ";
        String phrase2 = " году, то его возраст - разница между 2022 и ";
        String dot = ".";

        System.out.println(phrase1 + yob + phrase2 + yob + dot);

        yob = 1982;

        System.out.println(phrase1 + yob + phrase2 + yob + dot);
    }
}
