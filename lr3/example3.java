package lr3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 2;
        int b = in.nextInt();
        int []  a = new int [b];
        a[0] = 1;
        a[1] = 1;
/*        for (int i = 2; i <a.length  ; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        }*/
        while(c < a.length){
            a[c] = a[c - 1] + a[c - 2];
            c++;
        }
        for(int i=0; i < a.length; ++i)
            System.out.println(a[i]);
    }
}
