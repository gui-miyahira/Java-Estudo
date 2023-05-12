import java.util.Scanner;
import java.util.Arrays;
public class exercicio9 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    float vet01 [] = new float [10];

    for (int i = 0; i < vet01.length; i++) {
        System.out.println("Digite um valor para o indice "+i+" :");
        vet01 [i] = entrada.nextFloat();
    }

    float vet02 [] = new float [3];

    System.out.println("Escolha um indice de referência: ");

    int indice = entrada.nextInt();

    System.arraycopy(vet01, indice, vet02, 0, 3);
    System.out.println(Arrays.toString(vet01));
    System.out.println(Arrays.toString(vet02));

}

}