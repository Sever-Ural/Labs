package lr6.example5;

public class lab5 {
    static public long doubleSum(long n){
        long temp = 0;
        for (long i = 1; i <=n; i++){
            temp += i*i;
        }
        return temp;
    }
}
