import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limite = in.nextInt();
        if (limite <= 0) {
            double soma = 0;
            StringBuilder serie = new StringBuilder();
            for (int i = 1; i <= limite; i++) {
                double termo = 1.0 / i;
                if (i % 2 == 0) {
                    soma -= termo;
                    serie.append(" - 1/").append(i);
                } else {
                    soma += termo;
                    if (i > 1) {
                        serie.append(" + ");
                    }
                    serie.append("1/").append(i);
                }
            }
            System.out.printf("Soma: %.2f\n", soma);
            System.out.println("Equivale a: " + serie.toString());
        }
    }
}
