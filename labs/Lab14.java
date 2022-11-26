package labs;

import java.util.Scanner;
public class Lab14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num2 , num3 , num4;

        System.out.println("Number:");
        int num1 = in.nextInt();

        num2 = num1 - 1;
        num3 = num1 + 1;
        num4 = (num1 + num2 + num3);
        num4 = num4 * num4;

        System.out.println(num2);
        System.out.println(num1);
        System.out.println(num3);
        System.out.println(num4);
        in.close();
    }
}
