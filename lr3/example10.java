package lr3;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Integer a[] = new Integer[10], b = 100, c = 0;
        for (int i = 0; i < a.length; ++i) {
            a[i] = 1 + Math.abs(random.nextInt()) % (1 - 100 + 1);
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int values : a) {
            System.out.println(values );
        }
    }
}
