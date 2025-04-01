import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio = in.nextInt();
        int fim = in.nextInt();
        boolean primeiro = true;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                if (!primeiro) {
                    System.out.print(" "); 
                }
                System.out.print(i);
                primeiro = false;
            }
        }
    }
}
