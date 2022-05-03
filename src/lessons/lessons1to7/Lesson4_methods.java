package lessons.lessons1to7;

public class Lesson4_methods {

    public static void m1() {
        m2();
    }


    public static void m2() {
        System.out.println("Hello World");
    }

    public static void m3() {
        int x = 1;
        int y = 5;
        int sum = x + y;
        System.out.println(sum);
    }

    public static void m4() {
        System.out.println("Hello World");
    }


    public static void m4(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void m4(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    public static void mPrint(int a) {
        System.out.println(a);
    }

    public static void mPrint(String s) {
        System.out.println(s);
    }

    public static void mPrint(char c) {
        System.out.println(c);
    }

    public static void mPrint(int a, String s) {
        System.out.println(a + s);
    }

    public static void mPrint(String s, int a) {
        System.out.println(a + s);
    }


    public static void main(String[] args) {
        m1();
        m3();
        m4();
        m4(2, 3);
        m4(2, 3, 4);

        mPrint(10);
        mPrint("Оценка");
        mPrint('a');
        mPrint(1, "Hello");
        mPrint("Hello", 1);





    }


}
