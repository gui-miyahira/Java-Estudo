import java.util.Scanner;
import java.util.Arrays;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor1[] = new int[10];
        int maior = 0, menor = 0;

        System.out.print("Digite a posição 0 do vetor:");
        vetor1[0] = entrada.nextInt();
        menor = vetor1[0];

        for (int i = 1; i < vetor1.length; i++) {
            System.out.print("Digite a posição " + i + " do vetor:");
            vetor1[i] = entrada.nextInt();

            if (vetor1[i] < menor) {
                menor = vetor1[i];
            }

            if (vetor1[i] > maior) {
                maior = vetor1[i];   
            }
        }

        System.out.println("O maior número do vetor é: " + maior);
        System.out.println("O menor número do vetor é: " + menor);
    }
}
