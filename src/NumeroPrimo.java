import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true; // Inicializamos como primo e mudamos se encontrarmos um divisor

        // Começamos a verificar a divisibilidade a partir de 2 até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break; // Se encontrar um divisor, não precisa continuar verificando
            }
        }

        System.out.println(numero + " é primo? " + ehPrimo);
    }
}