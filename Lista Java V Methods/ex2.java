import java.util.Scanner;
public class ex2 {
    
 
        static void calculaIMC(String sex, double alt, double p){
            double resultado;
            resultado = p / (alt*alt);
            if(  sex.equalsIgnoreCase("h")){
                if( resultado > 32.3){
                    System.out.println(resultado + " Obeso!");
                }
                else if(resultado <= 32.3 && resultado >= 27.8 ){
                    System.out.println(resultado + " Acima do peso ideal!");
                }
                else if(resultado <= 27.8 && resultado >= 26.4){
                    System.out.println(resultado + " Marginalmente acima do peso!");
                }
                else if( resultado <= 26.4 && resultado >= 20.7){
                    System.out.println(resultado + " No peso normal!");
                }
                else if( resultado < 20.7){
                    System.out.println(resultado + " Abaixo do peso");
                }
            }else if( sex.equalsIgnoreCase("m")){

                if( resultado > 31.1){
                    System.out.println(resultado + " Obeso!");
                }
                else if(resultado <= 31.1 && resultado >= 27.3 ){
                    System.out.println(resultado + " Acima do peso ideal!");
                }
                else if(resultado <= 27.3 && resultado >= 25.8){
                    System.out.println(resultado + " Marginalmente acima do peso!");
                }
                else if( resultado <= 25.8 && resultado >= 19.1){
                    System.out.println(resultado + " No peso normal!");
                }
                else if( resultado < 19.1){
                    System.out.println(resultado + " Abaixo do peso");
                }
            }else{
                System.out.println("Sexo inválido!");
            };
        }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String sexo;
        double altura, peso;

        System.out.println("Você é homem ou mulher? digite 'm' ou 'h'.");
        sexo = entrada.nextLine();
    
        System.out.println("Informe sua altura:");
        altura = entrada.nextDouble();

        System.out.println("Informe seu peso:");
        peso = entrada.nextDouble();

        calculaIMC( sexo, altura , peso);
    }
}
