/**
 * exercicio3
 */
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        float nota1;
        float nota2;
        float media;

        System.out.println("Infomre a sua nota 1:");
        nota1 = entrada.nextFloat();
        System.out.println("Infomre a sua nota 2:");
        nota2 = entrada.nextFloat();
        
        media = ((nota1 + nota2) / 2);
        
        if( media < 4){
            System.out.println("Você está reprovado!");
        }
        else if( media >= 4 && media < 7){
            System.out.println("Você está de exame!");
        }
        else if ( media <= 10 ){
            System.out.println("Você está aprovado!");
        }

    }        
}

        
    

    
