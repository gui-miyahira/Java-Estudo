import java.util.Scanner;
public class ex4 {

    static int calculaFat(int num){
        if (num < 0){
            System.out.println("Digite um numero positivo!");
            return -1; // retornando um valor negativo para indicar erro
        }
            int fat = 1;
            for (int i = num;i > 0;i--) {
                fat = fat*i ;
            }
        return fat;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor para saber seu fatorial:");
        x = entrada.nextInt();

        int fatorial = calculaFat(x);

        if (fatorial >= 0){
            System.out.println("Fatorial: " + fatorial);
        }  
    }
}
