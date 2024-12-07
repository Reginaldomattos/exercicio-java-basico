import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        long fatorial = 1; // Iniciamos com 1, pois qualquer número multiplicado por 1 é ele mesmo
        int i = numero;

        while (i > 1) {
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}