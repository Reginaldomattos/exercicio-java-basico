import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contadorDigitos = 0;

        // Enquanto o número for diferente de zero, continuamos contando os dígitos
        while (numero != 0) {
            numero /= 10; // Dividimos o número por 10 para remover o último dígito
            contadorDigitos++;
        }

        System.out.println("O número possui " + contadorDigitos + " dígitos.");
    }
}