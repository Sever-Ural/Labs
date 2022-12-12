package lr3;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        char c = 'A', b[] = new char[20], d[] = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int i = 0; i < b.length; ++i) {
            b[i]=c;
            for (int j = 0; j < d.length; ++j) {
                if (b[i] == d[j]) {
                    i--;
                    break;
                }
            }
            c++;
        }
        for (int i = 0; i < b.length; ++i)
            System.out.println(b[i]);
    }
}
