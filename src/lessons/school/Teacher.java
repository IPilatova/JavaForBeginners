package lessons.school;

public class Teacher {

    public static void main(String[] args) {

        String line = "_______________________________";
        String firstName1 = "Мария Ивановна";
        String lastName1 = "Смирнова";
        int age1 = 35;
        String subject1 = "Русский язык и Литература";

        String firstName2 = "Иван Петрович";
        String lastName2 = "Серебряков";
        int age2 = 55;
        String subject2 = "Математика";

        System.out.println(line);
        System.out.println(firstName1);
        System.out.println(lastName1);
        System.out.println(subject1);
        System.out.println(line);

        System.out.println(line);
        System.out.println("Карточка учителя:");
        System.out.println("Имя         " + firstName2);
        System.out.println("Фамилия     " + lastName2);
        System.out.println("Предмет     " + subject2);
        System.out.println(line);
    }
}
