import java.util.Scanner;
import java.util.Locale;

public class Ativ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int limite = in.nextInt();
        
        if (limite > 0) {
            double soma = 0.0;
            for (int i = 1; i <= limite; i++) {
                soma += 1.0 / i;
            }
            System.out.printf("%.2f\n", soma);
        }
    }
}
