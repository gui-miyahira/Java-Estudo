import java.util.Scanner;
import java.util.Arrays;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float vet1[] = new float[3];
        float vet2[] = new float[3];
        float vet3[] = new float[6];
        float soma1=0, soma2=0;

        for (int i = 0; i < vet1.length; i++) {

            System.out.println("Digite o valor da posição " + i +" do vetor 1:");
            vet1[i] = entrada.nextFloat();

            soma1 = soma1 + vet1[i];
        }
        
        for (int i = 0; i < vet2.length; i++) {

            System.out.println("Digite o valor da posição " + i +" do vetor 2:");
            vet2[i] = entrada.nextFloat();

            soma2 = soma2 + vet2[i];

        }

        if( soma1 > soma2){

            System.arraycopy( vet1, 0, vet3, 0, 3);
            System.arraycopy( vet2, 0, vet3, 3, 3);
        }

        else{
            System.arraycopy( vet2, 0, vet3, 3, 3);
            System.arraycopy( vet1, 0, vet3, 0, 3);

        }

        System.out.println(Arrays.toString(vet1));
        System.out.println(Arrays.toString(vet2));
        System.out.println(Arrays.toString(vet3));

    
            


        




        
    }

    
}