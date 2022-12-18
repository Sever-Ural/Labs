package lr4;
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Колчисетво срок: ");
        int a =id.nextInt();
        System.out.print("Колчисетво столбцов: ");
        int b = id.nextInt();
        int Snake[][] = new int[a][b];
        int back = 0, main = 0, h = 0;
        for (int i = 0 ; h <Snake.length ; h++) {
            for (int j = 0 ; j <(Snake[i].length - back); j++) {
                Snake[i][j] = main;
                main++;
            }
            i++;
            for (int k = i; k <Snake.length; k++) {
                Snake[k][Snake[i].length-1-back] = main;
                main++;
            }
            back++;
        }
        for (int i =0; i < Snake.length; i++){
            for (int j = 0; j <Snake[i].length; j++){
                System.out.print(Snake[i][j]+" ");
            }
            System.out.println();
        }

    }
}
