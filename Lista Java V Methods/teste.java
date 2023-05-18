import java.util.Scanner;
public class teste {

    static void calculaIMC(int p, double alt){
        double resultado;
        resultado = p /(alt*alt);
        System.out.println("IMC: "+resultado);
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int peso;
        double altura;
        System.out.println("Informe o peso:");
        peso = entrada.nextInt();
        System.out.println("Informe a altura:");
        altura = entrada.nextDouble();
        calculaIMC(peso, altura);
       
    }
}