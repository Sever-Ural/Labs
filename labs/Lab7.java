package labs;

import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = in.nextLine();

        System.out.println("Your age:");
        int age = in.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        in.close();
    }
}