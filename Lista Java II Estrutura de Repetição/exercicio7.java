import java.util.Scanner;
import java.util.Arrays;
public class exercicio7{
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       int vet1[] = new int[8];
      
       
       
       for (int i = 0; i < vet1.length; i++) {
        System.out.println("Digite o valor da posição " + i + " :");
        vet1[i] = entrada.nextInt();
       }
       for (int i = 0; i < 4; i++) {

        int x = vet1[i];
        vet1[i] = vet1[ 7 - i];
        vet1[7-i] = x;
        
        
        System.out.println(Arrays.toString(vet1));
    }
    
    }
    
}
