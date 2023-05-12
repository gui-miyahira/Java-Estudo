import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("8. Preencha valores inteiros para uma matriz A 4 x 4 e para uma matriz B 4 x 4. Gerar e imprimir a soma de A+B.");

        int mat1[][] = new int[4][4];
        int mat2[][] = new int[4][4];
        int mat3[][] = new int[4][4];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.println("Digite o valor na matriz mat1["+i+"]["+j+"]:");
                mat1[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.println("Digite o valor na matriz mat2["+i+"]["+j+"]:");
                mat2[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                mat3[i][j] = mat2[i][j] + mat1[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
