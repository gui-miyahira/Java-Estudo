import java.util.Scanner;
import java.util.Arrays;
public class exercicio8 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int vet01 [] = new int [9];

    for (int i = 0; i < vet01.length; i++) {
        System.out.println("Digite um valor para o indice "+i+" :");

        vet01 [i] = entrada.nextInt();
    }

    int vet02 [] = new int [vet01.length];
    for (int i = 0; i < vet02.length; i++) {

        vet02 [vet01.length-1-i] = vet01 [i];
}

    System.out.println(Arrays.toString(vet01));
    System.out.println(Arrays.toString(vet02));

}

}