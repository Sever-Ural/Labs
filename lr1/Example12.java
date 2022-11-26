package lr1;

import java.util.Scanner;
public class Example12 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int answer;
            answer = 2022;

            System.out.println("Year age: ");
            int age = in.nextInt();

            answer = answer - age;

            System.out.println("Your born:" + age);
            in.close();
    }
}
