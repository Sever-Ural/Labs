package lr6.example8;

public class lab8 {
    static public float mid(int[] array){
        float temp = 0;
        for(int midarray : array ){
            temp +=midarray;
        }
        return temp/array.length;
    }
}
