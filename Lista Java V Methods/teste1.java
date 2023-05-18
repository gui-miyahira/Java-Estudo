import java.util.Scanner;
public class teste1 {
    static double calculaIMC(int p, double alt){
        double resultado;
        resultado = p /(alt*alt);
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int peso;
        double altura, resultado;
        System.out.println("Informe o peso:");
        peso = entrada.nextInt();
        System.out.println("Inorme a altura:");
        altura = entrada.nextDouble();
        resultado = calculaIMC(peso, altura);
        System.out.println("IMC: "+ resultado);
    }
}
