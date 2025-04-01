import java.util.Scanner;

public class Ativ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio = in.nextInt();
        int fim = in.nextInt();
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i);
            if (i < fim) {
                System.out.print(" ");
            }
        }
    }
}
