import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("2. Faça um programa que preencha uma matriz 3 x 3 com entradas do usuário, só que ao invés de preencher linha-a-linha, deverá ser preenchido coluna-a-coluna.");
        
        int mat[][] = new int[3][3];
        

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.printf("Insira o valor no campo mat[%d][%d] = " ,i,j);
                mat[i][j] = entrada.nextInt();
                
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j] +  " ");
                
            }
            System.out.println( "\n");
        }
    }
    
}
