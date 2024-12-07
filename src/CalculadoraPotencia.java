import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1; // Iniciamos com 1, pois qualquer número elevado a 0 é 1

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + expoente + " = " + resultado);
    }
}