package lr4;

public class example4 {
    public static void main(String[] args) {
        char a[][] = new char [10][10];
        int b = 0;
        for (int i = 0 ; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                a[j][i] = '#';
            }
        }
        for (int i = 0 ; i < 10; i++){
            for (int j = 0; j <= b; j++){
                System.out.print(a[j][i]);
            }
            b++;
            System.out.println("\r");
        }
    }
}
