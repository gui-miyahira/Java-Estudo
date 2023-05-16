import java.util.Scanner;

public class exercicioString07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreve seu nome completo: ");
        String nomeCompleto = entrada.nextLine();

        int posicaoUltimoEspaco = nomeCompleto.lastIndexOf(" ");
        
        String sobrenome = nomeCompleto.substring(posicaoUltimoEspaco + 1);
        System.out.println("Sobrenome: " + sobrenome);
    }
}
