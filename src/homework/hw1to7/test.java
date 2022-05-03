package homework.hw1to7;

public class test {

    public static void DigitShort1(short d) {

        String result21 = "";

        if (Math.abs(d) / 10000 >= 1) {
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

        DigitShort1((short) 1);

    }


}
