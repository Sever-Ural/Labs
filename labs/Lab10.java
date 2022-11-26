package labs;

import java.util.Scanner;
public class Lab10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int answer;
        answer = 2022;

        System.out.println("Year born: ");
        int year = in.nextInt();

        answer = answer - year;

        System.out.println("Your age: " + answer);
        in.close();
    }
}
