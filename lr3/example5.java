package lr3;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0,b = 0;
/*        for (int i = 0; i < a ; ++i){
            if(i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
            }
        }*/
        while(b < a) {
            if (b % 5 == 2 || b % 3 == 1) {
                System.out.println(b);
                sum += b;
            }
            b++;
        }
        System.out.println(sum);
    }
}
