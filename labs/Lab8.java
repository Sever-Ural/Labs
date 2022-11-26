package labs;

import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Week day: ");
        String week = in.nextLine();

        System.out.println("Мonth :");
        String month = in.nextLine();

        System.out.println("Date: ");
        int date = in.nextInt();

        System.out.println(week + " " + month + " " + date);
        in.close();
    }
}
