package lr6.example9;

public class lab9 {
    static public char[] sort(char[] c){
        var temp = new char[c.length];
        for (int i=0; i<c.length; i++){
            temp[i]= c[c.length-i-1];
        }
        return temp;
    }
}
