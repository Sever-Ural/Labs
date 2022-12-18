package lr4;

import java.util.Random;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Random random = new Random(100);
        Scanner in = new Scanner(System.in);
        System.out.println("Колчисетво столбцов");
        int c = in.nextInt();
        System.out.println("Колчисетво срок");
        int d = in.nextInt();
        int a[][] = new int[c][d];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                a[i][j] = random.nextInt(100);
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        int e = random.nextInt(c-1);
        int f = random.nextInt(d-1);
        System.out.println("Удалить столбец "+ e +" ;Удалить строку " + d);
        System.out.println("-------------------------------------");
        int b[][] = new int [c-1][d-1];
        for (int i = 0,s = 0 ; i < c-1; s++) {
            if(s!=e) {
                for (int j = 0,k = 0; j < d -1; k++) {
                    if(k!= f) {
                        b[i][j] = a[s][k];
                        System.out.print(" " + b[i][j] + " ");
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        }

    }
}
