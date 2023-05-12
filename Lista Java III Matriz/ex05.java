import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("5. Faça um programa que receba as notas de 10 alunos em cinco provas diferentes e armazene-as em uma matriz 10 x 5. O programa deverá calcular e mostrar:  Para cada aluno, a média aritmética das cinco provas e a situação (Aprovado ou Reprovado);  A média da classe");
        
        float mat[][] = new float[10][5];
        float media = 0, soma = 0, somag = 0, mediag = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Aluno "+(i+1)+" digite sua nota "+(j+1)+" : ");
                mat[i][j] = entrada.nextFloat();
                soma = soma + mat[i][j];
                media = soma/5;
            }

            System.out.println("A media do aluno " + (i+1) +" é: " + media);
            if(media >= 6){
                System.out.println("APROVADO!");
            }
            else{
                System.out.println("REPROVADO!");
            }
            somag += media;
            media = 0;
            soma = 0;

        }
        mediag = somag / 10;
        System.out.println("A média da sala é: " + mediag );
    }   
}
