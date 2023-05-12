import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("9. Faça um programa que preencha uma matriz 5 x 5 de caracteres e depois peça ao usuário para digitar uma letra. A letra digitada deverá ser buscada e mostre em quais posições a letra se encontra. Caso a letra não exista na matriz, o usuário deverá receber uma mensagem");

        char mat[][] = new char[3][3];
        int x = 0, cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite uma letra na posicao mat["+i+"]["+j+"]:" );
                mat[i][j] = entrada.nextLine().charAt(0);
            }
        }
        
        System.out.println("Digite o valor que deseja buscar na matriz:");
        x = entrada.nextLine().charAt(0);  

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if ( x == mat[i][j]){
                    System.out.println("A letra procurada se encontra na posição mat["+i+"]["+j+"]");
                    cont++;
                }
            }
        }

        if( cont == 0){
            System.out.println("A letra procurada nao se encontra na matriz!");
        } 
    }
}
