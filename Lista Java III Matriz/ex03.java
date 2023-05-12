import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("3.Faça um programa que preencha uma matriz 2 x 4 com números inteiros, calcule e mostre:");
        System.out.println("A quantidade de elementos pares, em cada linha da matriz; A média dos elementos pares da matriz.");
        
        int mat[][] = new int[2][4];
        int soma = 0, media = 0, qnt = 0;
        
       for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            System.out.println("Preencha o valor na posicao mat["+(i+1)+"]["+(j+1)+"]");
            mat[i][j] = entrada.nextInt();

            if( mat[i][j] % 2 == 0){
                qnt++;
                soma +=  mat[i][j];
            }
            
        }
       }
       media = (soma / qnt);
       System.out.println("Quantidade de elementos pares:" + qnt);
       System.out.println("Media dos elementos pares da matriz:" + media);

    }
    
}
