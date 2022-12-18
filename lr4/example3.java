package lr4;

public class example3 {
    public static void main(String[] args) {
        char a[][] = new char [23][11];
        for (int i = 0 ; i < 11; i++) {
            for (int j = 0; j < 23; j++){
                a[j][i] = '#';
            }
        }
        for (int i = 0 ; i < 11; i++){
            for (int j = 0; j < 23; j++){
                System.out.print(a[j][i]);
            }
            System.out.println("\r");
        }
    }
}
