package lr3;

import java.util.Random;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int a[] = new int[10],b = 100,c = 0;
        for (int i = 0; i < a.length; ++i) {
            a[i] = 1 + Math.abs(random.nextInt()) % (1 - 100 +1);
            if (b >= a[i]) {
                b = a[i];
                c = i;
            }
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
        System.out.println("Меньшее из чисел " + b );
        for (int i = 0; i < a.length; ++i) {
            if (b >= a[i]) {
                c = i;
                System.out.println("индекс " + c);
            }
        }
    }
}
