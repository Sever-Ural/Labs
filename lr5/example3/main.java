package lr5.example3;

import java.util.Scanner;

public class main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = in.nextInt();
        System.out.println("введите второе число");
        int b = in.nextInt();
        lab3 lab3_1 = new lab3();
        lab3 lab3_2 = new lab3(a);
        lab3 lab3_3 = new lab3(a,b);
    }
}
