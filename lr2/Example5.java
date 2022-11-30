package lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        long a = in.nextInt();

        a /= 1000;

        System.out.println( a + " тысячи");

    }

}
