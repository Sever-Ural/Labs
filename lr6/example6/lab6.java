package lr6.example6;

public class lab6 {
    public static int[] arrayoption(int [] array, int n){
        if(n >= array.length) return array.clone();
        var temp = new int[n];
        for(int i=0; i<n;i++){
            temp[i] = array[i];
        }
        return temp;
    }
}
