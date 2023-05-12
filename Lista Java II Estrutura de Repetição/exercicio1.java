import java.util.Scanner;
import java.util.Arrays;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int [15];
        double media = 0, soma = 0;

        for( int i =0; i < 15; i++){
            System.out.println("Digite um numero para preencher o indice "+i+" vetor: ");
            vetor[i] = entrada.nextInt();

            soma = soma + vetor[i];

        }
        media = soma / 15;
        System.out.println("A soma de todos os valores do vetor é:" + soma);
        System.out.println("A media dos valores do vetor deu: " + media);
        System.out.println(Arrays.toString(vetor));
    }

    
}
