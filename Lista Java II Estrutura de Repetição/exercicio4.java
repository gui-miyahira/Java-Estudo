import java.util.Scanner;



import java.util.Arrays;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        double  media = 0, soma = 0;
        int vet1[] = new int[10];
        int i = 0, contador = 0, acimamedia = 0;

        for( i = 0; i < vet1.length; i++){

            System.out.println("Informe a nota do "+ (i+1) +" aluno:");
            vet1[i] = entrada.nextInt();

            if( vet1[i] == -1){
                break;
            }
            else if ( vet1[i] > 10){
                System.out.println("Digite um valor válido:");
                i--;
            }
            else{
                soma = vet1[i] + soma;
                contador++;
            }
            System.out.println(Arrays.toString(vet1));
        }

        media = soma / contador;

        for( i = 0; i < vet1.length; i++){
            if(vet1[i] > media){
                acimamedia++;
            }
        }
    
        System.out.println("Valores na ordem inversa: ");
        for (i = contador -1 ; i >= 0; i--) {
            System.out.println(vet1[i]);
        }

        System.out.println("A média das notas é: " + media);
        System.out.println("Foram lidos " +i+ " valores!");
        System.out.println("A soma dos valores do vetor é: "+soma);
        System.out.println("Quantidade de alunos acima da média: " +acimamedia);
        
    }
    
}
