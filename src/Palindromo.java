import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0, resto;
        int originalNumero = numero;

        // Inverter o número
        while (numero != 0) {
            resto = numero % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numero /= 10;
        }

        // Verificar se o número é palíndromo
        if (originalNumero == numeroInvertido) {
            System.out.println(originalNumero + " é um palíndromo.");
        } else {
            System.out.println(originalNumero + " não é um palíndromo.");
        }
    }
}