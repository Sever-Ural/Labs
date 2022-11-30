package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();

        if(a%4 == 0 && a > 9)
            System.out.println("Число делится");
        else
            System.out.println("Число не делится или число меньше 10");

    }

}
