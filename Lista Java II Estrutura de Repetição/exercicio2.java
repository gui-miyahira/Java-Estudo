import java.util.Scanner;
import java.util.Arrays;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = 0;
        double media = 0, soma = 0;
        int par = 0, impar = 0;

        System.out.println("Informe o valor de índices que voce deseja no vetor: ");
        x = entrada.nextInt();

        int vetor[] = new int [x];
        System.out.println(Arrays.toString(vetor));

        for( int i =0; i < x; i++){
            System.out.println("Digite um numero para preencher o indice "+i+" vetor: ");
            vetor[i] = entrada.nextInt();

            soma = soma + vetor[i];

            if ( (vetor[i] % 2) == 0){
                par++;
            }
            else{
                impar++;
            }
            }
        
        media = soma / x;
        System.out.println("Numeros impares: " + impar);
        System.out.println("Numeros pares: " + par);
        System.out.println("A soma de todos os valores do vetor é:" + soma);
        System.out.println("A media dos valores do vetor deu: " + media);
        System.out.println(Arrays.toString(vetor));
    }

    
}
