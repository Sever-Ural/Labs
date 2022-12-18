package lr4;

public class example2 {
    public static void main(String[] args) {
        int a = 15;
        int b=0;
        for (int i = 1 ; i <= a; i++){
            for (int j = 0; j <=b; j++){
                System.out.print("#");
            }
            b = b + 1;
            System.out.println("\r");
        }
    }
}
