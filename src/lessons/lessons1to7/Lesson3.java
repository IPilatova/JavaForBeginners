package lessons.lessons1to7;

public class Lesson3 {

//    static int a;
//    static Integer A;
//    static double d;
//    static Double D;
//    static String S;

    public static void main(String[] args) {

        int a;
        Integer A;

//        a = null; - так нельзя
        a = 10;
        A = 0;
        A = null;
        A = 15;

        A.toString();

        System.out.println(A);
        System.out.println(A.toString());

        System.out.println(A + A);
        System.out.println(A.toString() + A);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer.sum(5, 10);
        System.out.println(Integer.sum(5, 10));

//        Integer.sum(1.2, 4.5); - так нельзя, т.к. метод только для int;

//        System.out.println(a);
//        System.out.println(A);
//
//        System.out.println(d);
//        System.out.println(D);
//
//        System.out.println(S);
    }
}
