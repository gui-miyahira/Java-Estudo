import java.util.Scanner;
import java.util.Arrays;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor1[] = new int[10];
        int maior = 0, menor = 0;


        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite a posição " + i + " do vetor:");
            vetor1[i] = entrada.nextInt();
            if(i == 0){
                maior = vetor1[i];
                menor = vetor1[i];
            }
            else if( vetor1[i] > maior){
                maior =  vetor1[i];   
            }
            else if(vetor1[i] < menor){
                menor = vetor1[i];
            }
                       

        }
        System.out.println("O maior numero do vetor é: " + maior);
        System.out.println("O menor numero do vetor é: " + menor);
        
    }
    
}
