import java.util.Scanner;

public class exercicioString03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        nome = nome.toLowerCase();

        int vogais = 0;
        int espacos = 0;

        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u') {
                vogais++;
            }

            if (letra == ' ') {
                espacos++;
            }

            System.out.println(letra);
        }


        System.out.println("O seu nome tem " + vogais + " vogais e " + espacos + " espaços");


    }
}
