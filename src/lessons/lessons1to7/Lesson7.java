package lessons.lessons1to7;

public class Lesson7 {

    public static void main(String[] args) {

        //ячейка памяти типа String-массив
        String[] catsNames; // выделили ячейку памяти, где будет лежать ключ от массива
        //объект типа String-массив, состоящий и 8 ячеек
        catsNames = new String[8]; // создали массив из 8 ячеек и положили ключ в catsNames

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        catsNames[6] = "Рыжик";


        //объект типа int-массив, состоящий и 8 ячеек
        int[] catsAges = new int[8];

        System.out.println(catsNames);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsAges[2]);
        System.out.println(catsNames[4]);
        System.out.println(catsNames[6]);

        for (int i = 0; i < 8; i++) {
            System.out.print(catsNames[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик") {
                System.out.println(catsNames[i]);
            }
        }

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик") {
                System.out.println(i);
            }
        }

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Черныш") {
                System.out.println(i);
            }
        }




    }
}
