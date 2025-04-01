import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limite = in.nextInt();
        
        if (limite <= 0) {
            double soma = 0;
            StringBuilder serie = new StringBuilder();
            for (int i = 1; i <= limite; i++) {
                soma += 1.0 / i;
                serie.append("1/").append(i);
                if (i < limite) {
                    serie.append(" + ");
                }
            }
            System.out.printf("%.2f\n", soma);
            System.out.println(serie.toString());
        }
    }
}
