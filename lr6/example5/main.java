package lr6.example5;

public class main {
    static public void main(String[] arg){
        var n = 4;
        var result = lab5.doubleSum(n);
        System.out.println("result: "+result);

        var check = n*(n+1)*(2*n+1)/6;
        System.out.println("result chack: "+ check);
    }
}
