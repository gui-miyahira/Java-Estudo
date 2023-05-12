import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("6. Faça um programa que preencha uma matriz de 3 x 3, calcule e mostre: Mostre a soma dos elementos que estão na diagonal principal e na diagonal secundária; Mostre a soma dos elementos de cada uma das linhas; Mostre a soma de cada uma das colunas.");

        int mat[][]=new int[3][3];
        int somaDp =0, somaDs=0, somaC=0, somaL=0;

        for ( int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("Matriz [" + i+ "][" +j+"]: ");
                mat[i][j] = entrada.nextInt();
            }
        }

        for ( int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i == j){
                    somaDp += mat[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + somaDp);

        for ( int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i+j == mat[i].length -1){
                    somaDs += mat[i][j];
                }
            }
        }
        
        System.out.println("Soma da diagonal secundária: " + somaDs);
        System.out.println();

        for ( int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                somaL+= mat[i][j];
                somaC += mat[j][i];
            }
            System.out.println("Soma da linha " + (i+1)+": " +somaL);
            somaL=0;
            System.out.println("Soma da coluna " + (i+1)+": " +somaC);
            somaC=0;
            System.out.println();
        }
    }
}





    
    
