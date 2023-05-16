import java.util.Scanner;

public class exercicioString01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        int tamanhoFrase = frase.length();

        System.out.println("O tamanho da frase digiada é de: " + tamanhoFrase + " caracteres.");
    }
}
