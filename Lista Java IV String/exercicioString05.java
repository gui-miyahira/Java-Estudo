import java.util.Scanner;

public class exercicioString05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para ver como se escreve por extenso: ");
        String num = entrada.nextLine();

        String[] digitos = {
            "zero", "um", "dois", "três", "quatro",
            "cinco", "seis", "sete", "oito", "nove"
        };

        for (int i = 0; i < num.length(); i++) {
            char digito = num.charAt(i);
            System.out.println(digitos[Character.getNumericValue(digito)]);
        }
    }
}
