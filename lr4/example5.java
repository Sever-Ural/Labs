package lr4;

import java.util.Random;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Random random = new Random(100);
        Scanner in = new Scanner(System.in);
        System.out.println("Колчисетво столбцов");
        int c = in.nextInt();
        System.out.println("Колчисетво срок");
        int d = in.nextInt();
        int a[][] =new int[c][d];
        for (int i = 0 ; i < c; i++) {
            for (int j = 0; j < d; j++){
               a[i][j] = random.nextInt(100);
                System.out.print(" "+ a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        int b[][] = new int [d][c];
        for (int i = 0 ; i < d; i++) {
            for (int j = 0; j < c; j++){
                b[i][j] = a[j][i];
                System.out.print(" "+ b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
