package lr6.example6;

import java.sql.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] arg){
        var a = new int[] {1,2,3,4};

        System.out.println("array: "+ Arrays.toString(a));
        System.out.println("2 symblos of array: " + Arrays.toString(lab6.arrayoption(a,2)));
        System.out.println("20 symblos of array: " + Arrays.toString(lab6.arrayoption(a,20)));
    }
}
