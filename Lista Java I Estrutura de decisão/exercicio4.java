import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2;
        int num;


        System.out.println(" Digite 1 - Fazer média de dois números. \n Digite 2 - Para fazer a diferença do maior número pelo menor. \n Digite 3 - Produto de dois números.");
        num = entrada.nextInt();

        switch(num){
            case 1:
                System.out.println("Informe seu primeiro número:");
                num1 = entrada.nextFloat();
                System.out.println("Informe seu primeiro número:");
                num2 = entrada.nextFloat();
                System.out.println("A média dos dois números é: " + (num1+num2)/2);
                break;          
        
            case 2:
                System.out.println("Informe seu primeiro número:");
                num1 = entrada.nextFloat();
                System.out.println("Informe seu segundo número:");
                num2 = entrada.nextFloat();

                if(num1 > num2){
                    
                    System.out.println("A diferença do maior pro menor número é: " + (num1 - num2)); 
                }
                else if( num1 < num2){

                    System.out.println("A diferença do maior pro menor número é: " + (num2 - num1));
                }
                else{
                    System.out.println("A diferença é :" +  (num1 - num2));
                }
                break;

            case 3:
                System.out.println("Informe seu primeiro número:");
                num1 = entrada.nextFloat();
                System.out.println("Informe seu segundo número:");
                num2 = entrada.nextFloat();

                System.out.println("O produto dos dois números é: " + num1*num2);
                break;
            }
    }
}
