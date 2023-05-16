import java.util.Scanner;

public class exercicioString04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite duas palavras para comparar uma com a outra: ");
        System.out.println(" ");

        System.out.println("Digite a primeira palavra: ");
        String p1 = entrada.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String p2 = entrada.nextLine();

        if(p1.length() != p2.length()){
            System.out.println("As strings não possuem o mesmo comprimento, não é possível fazer essa comparação");
        }else{
            int result = p1.compareToIgnoreCase(p2);

            if (result != 0) {
                System.out.println("As strings não são iguais.");
            } else {
                int result2 = p1.compareTo(p2);

                if (result2 != 0) {
                    System.out.println("As strings não são exatamentes iguais");
                }else{
                    System.out.println("As strings são exatamente iguais.");
                }
            }
        }
    }
}
