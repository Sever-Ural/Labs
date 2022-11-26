package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write first name: ");
        String firts_name = in.nextLine();

        System.out.println("Write second name: ");
        String second_name = in.nextLine();

        System.out.println("Write patronymic: ");
        String patronymic = in.nextLine();

        System.out.println("Hello: " + firts_name + " " + second_name + " " + patronymic);
        in.close();
    }
}
