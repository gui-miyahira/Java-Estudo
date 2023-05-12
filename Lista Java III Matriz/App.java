import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int m1[][] = new int[3][5];
        int i ,j;
        int soma = 0, contpar = 0, contimpar = 0;

        for (i = 0; i < m1.length; i++) {
            System.out.println("Informe a " + (i+1) + "a. linha:");
            
            for (j = 0; j < m1[i].length; j++) {
                System.out.println("m[" + i + "] [" + j + "]");
                m1[i][j] = entrada.nextInt();
            }
        }

        for (i=0; i < m1.length; i++) {
          for (j=0; j < m1[i].length; j++) {
            soma += m1[i][j];
            if(m1[i][j] % 2 == 0){
              contpar++;
            }else{
              contimpar++;
            }
          }
        }
        System.out.println("Soma: "+soma);
        System.out.println("Qtdade de pares: "+contpar);
        System.out.println("Qtdade de ímpares: "+contimpar);
    }
}
