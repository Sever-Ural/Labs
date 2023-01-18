package lr6.example10;

public class lab10 {
    static public int[] arrayMaxMin(int[] array){
        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;
        for(int i=0;i< array.length; i++){
            max = Math.max(max,array[i]);
            min = Math.min(min,array[i]);
        }
        return new int[]{max,min};
    }
}
