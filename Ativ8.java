import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio = in.nextInt();
        int fim = in.nextInt();
        boolean primeiro = true;
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                if (!primeiro) {
                    System.out.print(" ");
                }
                System.out.print(i);
                primeiro = false;
            }
        }
    }
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
