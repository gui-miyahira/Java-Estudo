import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;
        int tempo;
        int taxa;
        int prest;

        System.out.println("Informe o valor a ser pago:");
        valor = entrada.nextInt();
        System.out.println("Informe o tempo em meses:");
        tempo = entrada.nextInt(); 
        System.out.println("Informe o valor da taxa:");
        taxa = entrada.nextInt();
        
        prest = valor + (valor + (taxa/100)*tempo);

        System.out.println("A prestação atrasda com juros é:"+ prest);
    }
}
