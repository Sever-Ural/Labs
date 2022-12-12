package lr3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, c = 1;
        a = in.nextInt();
        if(a > 0) {
        int b[] = new int[a];
            for (int i = 0; i < b.length; i++) {
                int d = 0;
                while (d != 1) {
                    if (c % 5 == 2) {
                        b[i] = c;
                        d++;
                        c++;
                    }
                    c++;
                }
            }
            for (int i = 0; i < b.length; ++i) {
                System.out.println(b[i]);
            }
        }else
            System.out.println("некорректное значение");
    }
}
