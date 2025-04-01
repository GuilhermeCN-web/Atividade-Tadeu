import java.util.Locale;
import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int limite = in.nextInt();
        if (limite > 0) {
            double soma = 0;
            for (int i = 1; i <= limite; i++) {
                double termo = 1.0 / i;
                if (i % 2 == 0) {
                    soma -= termo;
                } else {
                    soma += termo;
                    if (i > 1) {
                    }
                }
            }
            System.out.printf("%.2f\n", soma);
        }
    }
}
