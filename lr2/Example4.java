package lr2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();

        if(a >= 5 && a <= 10)
            System.out.println("Число в диапозоне");
        else
            System.out.println("Число не в диапозоне");

    }
}
