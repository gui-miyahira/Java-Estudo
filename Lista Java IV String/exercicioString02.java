import java.util.Scanner;

public class exercicioString02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}
