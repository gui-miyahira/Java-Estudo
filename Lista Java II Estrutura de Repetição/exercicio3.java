import java.util.Scanner;
import java.rmi.StubNotFoundException;
import java.util.Arrays;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vet1[] = new int[5];
        int vet2[] = new int[5];
        int vet3[] = new int[5];
        

        for( int i = 0; i < 5; i++){

            System.out.println("Informe o " + i + " indice do vetor1:");
            vet1[i] = entrada.nextInt();
            System.out.println("Informe o " + i + " indice do vetor2:");
            vet2[i] = entrada.nextInt();

            vet3[i] = vet1[i] + vet2[i]; 

            System.out.println(Arrays.toString(vet1));
            System.out.println(Arrays.toString(vet2));
           
        }

        System.out.println(Arrays.toString(vet3));

    }
    
}
