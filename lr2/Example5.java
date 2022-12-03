package lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();

        int c =  a /1000;

        if(c >= 10)
            c %= 10;
        System.out.println( c + " тысячи");
        in.close();
    }
}
