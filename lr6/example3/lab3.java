package lr6.example3;

public class lab3 {

    static int min(int... args){
        var temp = Integer.MAX_VALUE;
        for(int arg : args){
            temp = Math.min(temp,arg);
        }
        return temp;
    }
    static int max(int... args){
        var temp = Integer.MIN_VALUE;
        for(int arg : args){
            temp = Math.max(temp,arg);
        }
        return temp;
    }

    static float mid(float... args){
        float temp = 0;
        for(float arg : args){
            temp += arg;
        }
        return temp/ args.length;
    }
}
