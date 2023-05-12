import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    
        
        int c;
        int divs;
        int divd;

        System.out.println("Digite o número 1:");
        int a = entrada.nextInt();
        
        System.out.println("Digite o número 2:");
        int b = entrada.nextInt();

        if(b > a){

            divd = b;
            divs = a;
        }
        else{
            divd = a;
            divs = b;
        }
        
        while( (divd%divs) != 0){

            c = divd % divs;
            divd = divs;
            divs = c;
        }

        System.out.println("O MDC de "+ a + " e " + b + " : "+ divs);
    }
    
}
