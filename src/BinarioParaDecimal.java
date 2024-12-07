import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String numeroBinario = scanner.nextLine();

        int decimal = 0;
        int potencia = 0;

        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            if (numeroBinario.charAt(i) == '1') {
                decimal += Math.pow(2, potencia);
            }
            potencia++;
        }

        System.out.println("O número decimal equivalente é: " + decimal);
    }
}