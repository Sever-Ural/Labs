package labs;

import java.util.Scanner;
public class Lab13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("First number:");
        int num1 = in.nextInt();

        System.out.println("Second number:");
        int num2 = in.nextInt();

        num1 = num1 + num2;

        System.out.println(num1);
        in.close();
    }
}
