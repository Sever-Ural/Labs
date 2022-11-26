package lr1;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Номр месяца :");
        int month = in.nextInt();

        System.out.println("День: ");
        int day = in.nextInt();
        if(month>0 && month<13)
            if(month == 1)
                if(day > 0 && day < 32 )
                    System.out.println("Январь содережит столько дней");
                else
                    System.out.println("Январь не содержит столько дней");
            if(month == 2)
                if(day > 0 && day < 29 )
                    System.out.println("Февраль содережит столько дней");
                else
                    System.out.println("Февраль не содержит столько дней");
            if(month == 3)
                if(day > 0 && day < 32 )
                    System.out.println("Март содережит столько дней");
                else
                    System.out.println("Март не содержит столько дней");
            if(month == 4)
                if(day > 0 && day < 31 )
                    System.out.println("Апрель содережит столько дней");
                else
                    System.out.println("Апрель не содержит столько дней");
            if(month == 5)
                if(day > 0 && day < 32 )
                    System.out.println("Май содережит столько дней");
                else
                    System.out.println("Май не содержит столько дней");
            if(month == 6)
                if(day > 0 && day < 31 )
                    System.out.println("Июнь содережит столько дней");
                else
                    System.out.println("Июнь не содержит столько дней");
            if(month == 7)
                if(day > 0 && day < 32 )
                    System.out.println("Июль содережит столько дней");
                else
                    System.out.println("Июль не содержит столько дней");
            if(month == 8)
                if(day > 0 && day < 32 )
                    System.out.println("Агуст содережит столько дней");
                else
                    System.out.println("Август не содержит столько дней");
            if(month == 9)
                if(day > 0 && day < 31 )
                    System.out.println("Сентябрь содережит столько дней");
                else
                    System.out.println("Сентябрь не содержит столько дней");
            if(month == 10)
                if(day > 0 && day < 32 )
                    System.out.println("Октябрь содережит столько дней");
                else
                    System.out.println("Октябрь не содержит столько дней");
            if(month == 11)
                if(day > 0 && day < 32 )
                    System.out.println("Ноябрь содережит столько дней");
                else
                    System.out.println("Ноябрь не содержит столько дней");
            if(month == 12)
                if(day > 0 && day < 32 )
                    System.out.println("Декабрь содережит столько дней");
                else
                    System.out.println("Декабрь не содержит столько дней");
        else
            System.out.println("Некорректно введен месяц");
    }
}
