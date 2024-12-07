import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número (multiplicador): ");
        int n = scanner.nextInt();

        System.out.print("Digite o limite: ");
        int m = scanner.nextInt();

        System.out.print("Múltiplos de " + n + " até " + m + ": ");

        for (int i = n; i <= m; i += n) {
            System.out.print(i + " ");
        }
    }
}