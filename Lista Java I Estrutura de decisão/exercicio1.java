import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float raio;
        

        System.out.println("Qual o raio do círculo:");
        raio = entrada.nextFloat();
        
        
        System.out.printf("O comprimento do círculo é: " + raio* 2 * 3.14);
        System.out.printf("\nA área do círculo é: " + 3.14 * (raio*raio));
        System.out.printf("\nO volume do círculo é: " + 0.75 * 3.14 * (raio*raio*raio));


        
    }
    
}
