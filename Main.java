import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        System.out.println("\nДля проверки на ошибки введите:");
        System.out.println("1 - для IllegalStateException");
        System.out.println("2 - для IllegalArgumentException");
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        try {
            String input = scan.nextLine();
            int i = Integer.parseInt(input);
            switch (i) {

                case (1):
                    getIllegalState();
                    break;
                case (2):
                    getIlegalArgument();
                    break;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    public static void getIllegalState() {
        try {
            // Не хватает обяхательных полей
            new PersonBuilder()
                    .setName("Валера")
                    .setAge(10)
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public static void getIlegalArgument() {
        try {
            // Возраст недопустимый
            new PersonBuilder()
                    .setName("ван")
                    .setSurname("ванов")
                    .setAddress("Москва")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}