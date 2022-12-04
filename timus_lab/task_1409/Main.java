package timus_lab.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = a + b - 1;

        int d = c - a;
        int e = c - b;

        out.println(d + " " + e);
        out.flush();
    }
}
