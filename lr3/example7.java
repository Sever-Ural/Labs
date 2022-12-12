package lr3;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        char c = 'a', b[] = new char[10];
        for(int i=0;i < 10; ++i){
            b[i] = c;
            c += 2;
        }
        for(int i=0;i < 10; ++i){
            System.out.println(b[i]);
        }
        for(int i = (b.length - 1);i >= 0; --i){
            System.out.println(b[i]);
        }
    }
}
