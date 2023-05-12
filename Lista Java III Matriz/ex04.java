import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("4. Elabore um programa que preencha uma matriz 3 x 6, calcule e mostre: O maior elemento da matriz e sua respectiva posição; O menor elemento da matriz e sua respectiva posição.");
        
        int mat[][] = new int[3][6];
        int  x = 0, y = 0;
        int a = 0, b = 0;
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Digite o valor da mat["+i+"]["+j+"]:");
                mat[i][j] = entrada.nextInt();
                }
            }

            int maior = mat[0][0];
            int menor = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                

                if( mat[i][j] > maior){
                    maior = mat[i][j];
                    x = i;
                    y = j;
                    
                }
                if( mat[i][j] < menor){
                    menor = mat[i][j];
                    a = i;
                    b = j;
            }
        }
        }

        System.out.println("O maior valor da matriz é: " + maior + " que está na posicao: mat["+x+"]["+y+"]");
        System.out.println("O menor valor da matriz é: " + menor + " que está na posicao: mat["+a+"]["+b+"]");
    }
}

