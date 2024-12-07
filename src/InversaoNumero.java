import java.util.Scanner;

public class InversaoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10; // Obtém o último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Adiciona o dígito ao número invertido
            numero /= 10; // Remove o último dígito do número original
        }

        System.out.println("O número invertido é: " + numeroInvertido);
    }
}