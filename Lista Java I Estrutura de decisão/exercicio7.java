import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;
        int soma = 0;
        int count = 0;

        while (true) {
            System.out.println("Digite um valor positivo (ou 0 ou um número negativo para sair):");
            valor = entrada.nextInt();

            if (valor <= 0) {
                break;
            }

            soma = soma + valor;
            count++;
        }

        double media = (double) soma / count;

        System.out.println("Soma dos valores positivos: " + soma);
        System.out.println("Média dos valores positivos: " + media);
    }
}
