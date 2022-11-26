package labs;

import java.util.Scanner;
public class Lab15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num3 , num4;

        System.out.println("First number:");
        int num1 = in.nextInt();

        System.out.println("Second number:");
        int num2 = in.nextInt();

        num3 = num1 + num2;
        num4 = num1 - num2;

        System.out.println(num3);
        System.out.println(num4);
        in.close();
    }
}
