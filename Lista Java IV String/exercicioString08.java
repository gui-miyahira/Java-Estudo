import java.util.Scanner;

public class exercicioString08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome da disciplina: ");
        String disciplina = entrada.nextLine();
        
        if (disciplina.contains("Programacao")) {
            System.out.println("É da categoria de Programação");
        } else {
            System.out.println("Não é da categoria de Programação");
        }
    }
}
