package lr6.example4;

public class lab4 {
    static public long factor(int n){
        long temp = 1;
        for (int i = n; i >= 1; i-=2){
            temp *= i;
        }
        return temp;
    }
}
