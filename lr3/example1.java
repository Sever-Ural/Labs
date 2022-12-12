package lr3;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Это понедельник");
                break;
            case 2:
                System.out.println("Это вторник");
                break;
            case 3:
                System.out.println("Это среда");
                break;
            case 4:
                System.out.println("Это четверг");
                break;
            case 5:
                System.out.println("Это пятница");
                break;
            case 6:
                System.out.println("Это суббота");
                break;
            case 7:
                System.out.println("Это воскрессенье");
                break;
        }
        if(a < 1 | a > 7  )
            System.out.println("введено некорректное значение");
    }
}

