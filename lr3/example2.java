package lr3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
/*        switch (a){
        case "Понедельник":
        System.out.println("1");
        break;
        case "Вторник":
        System.out.println("2");
        break;
        case "Среда":
        System.out.println("3");
        break;
        case "Четверг":
        System.out.println("4");
        break;
        case "Пятница":
        System.out.println("5");
        break;
        case "Суббота":
        System.out.println("6");
        break;
        case "Воскресенье":
        System.out.println("7");
        break;
        }*/
        if (a.equals("Понедельник"))
            System.out.println("1");
        if (a.equals("Вторник"))
            System.out.println("2");
        if (a.equals("Среда"))
            System.out.println("3");
        if (a.equals("Четверг"))
            System.out.println("4");
        if (a.equals("Пятница"))
            System.out.println("5");
        if (a.equals("Суббота"))
            System.out.println("6");
        if (a.equals("Воскресенье"))
            System.out.println("7");
    }
}
