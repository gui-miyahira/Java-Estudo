import java.util.Scanner;
public class vetorteste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor [] = new double [10];
        int i;
        int x, achou= 0;
        x = entrada.nextInt();
        for (i=0; i<10; i++){
            System.out.println("Insira o valor"+(i+1)+":");
            valor[i] = entrada.nextDouble();
        }
        for (i=0; i<10; i++){
        if (valor[i]== x){
            System.out.println("O valor " + x + " está na posição: "+i);
            achou++;
        }
    }
    if (achou ==0) {
        System.out.println("Não há esse valor no vetor!");
        
    }
    }
}
