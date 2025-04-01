import java.util.Scanner;

public class Ativ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letra = in.next().charAt(0);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(letra);
        }
    }
}
