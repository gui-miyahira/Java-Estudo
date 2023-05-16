import java.util.Scanner;

public class exercicioString06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        System.out.print("Digite uma letra para buscar na frase: ");
        char letra = entrada.nextLine().charAt(0);
        
        String posicoes = "";
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                if (posicoes.length() > 0) {
                    posicoes += ",";
                }
                posicoes += i;
            }
        }
        
        if (posicoes.length() == 0) {
            System.out.println("A letra '" + letra + "' não foi encontrada na frase.");
        } else {
            System.out.println("A letra '" + letra + "' aparece nas posições: " + posicoes);
        }
    }
}
