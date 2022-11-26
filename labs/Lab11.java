package labs;

import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int answer;
        answer = 2022;

        System.out.println("Year name: ");
        String name = in.nextLine();

        System.out.println("Year born: ");
        int year = in.nextInt();

        answer = answer - year;

        System.out.println("Your name:"+ name + ", Your age:" + answer);
        in.close();
    }
}
