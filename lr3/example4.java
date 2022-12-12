package lr3;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d[],f=0;
        a = in.nextInt();
        b = in.nextInt();
        c = (b - a) +1;
        d = new int[c];
/*        for (int i = 0; i < d.length; ++i) {
            d[i] = a;
            a++;
        }*/
        while (f < d.length){
            d[f] = a;
            f++;
            a++;
        }
        for (int i = 0; i < d.length; ++i) {
            System.out.println(d[i]);
        }
    }
}
