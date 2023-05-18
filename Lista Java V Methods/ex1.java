import java.util.Scanner;
public class ex1 {

    static void verificarNum( int v){
       if ( v == 0 ){
        System.out.println("numero nulo!");
       }
       else if ( v != 0 && v % 2 == 0){
        System.out.println("numero par!");
       }
       else{
        System.out.println("numero impar");
       }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para verificar-lo:");
        int valor = entrada.nextInt();
        verificarNum(valor);
    }
}
