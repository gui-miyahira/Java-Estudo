import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;
public class ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Faça um programa que preencha uma matriz 3 x 5 com números inteiros, calcule e mostre a soma de todos os elementos dessa matriz");

        int mat[][] = new int[5][3];
        int i = 0, j = 0, soma = 0;

        for (i = 0; i < mat.length; i++) {
            System.out.println("Digite os valores da " + (i+1) + " linha:");
            for ( j = 0; j < mat[i].length; j++) {
                System.out.println("Valor do campo mat1["+(i+1)+"]["+(j+1)+"]. = ");
                mat[i][j] = entrada.nextInt();

                soma += mat[i][j];
            }
        }
        System.out.println("A soma de todos os elementos da matriz é:" + soma);
        
    }
    
}
