import java.util.Scanner;
import java.util.Arrays;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor1[] = new int[5];
        int vetor2[] = new int[vetor1.length];


        
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o valor da posição: " + i + " :");
            vetor1[i] = entrada.nextInt();
            
        }

        for (int i = 0; i < vetor1.length; i++) {
        
            vetor2[4 - i] = vetor1[i];
            
        }

        
            
        System.out.println(Arrays.toString(vetor2));
    }

    
}