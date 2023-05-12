import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("7. Crie um algoritmo que entre com valores inteiros para uma matriz m 3 x 3 e imprima a matriz final, conforme mostrado a seguir:");
        
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.println("Digite o valor que voce quer inserir na posicao mat["+i+"]["+j+"]");
                mat1[i][j] = entrada.nextInt();   
            } 
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat2[j][mat1.length - 1 - i] = mat1[i][j];
            }
        }
        
        System.out.println("Matriz com a rotação de 90°");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
