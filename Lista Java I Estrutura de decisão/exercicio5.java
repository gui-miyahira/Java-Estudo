import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float h;
        double peso;
        int sex;

        System.out.println(" Digite 1 - Para selecionar o sexo masculino \n Digite 2 - Para selecionar o sexo feminino.");
        sex = entrada.nextInt();

        switch(sex){
            case 1:

            System.out.println("Informe sua altura:");
            h = entrada.nextFloat();

            peso = (72.7*h)-58;

            System.out.println("Seu peso ideal é: "+ peso);
            break;

            case 2:

            System.out.println("Informe sua altura:");
            h = entrada.nextFloat();

            peso = (62.1*h)-44.7;

            System.out.println("Seu peso ideal é: "+ peso);
            

        }
        














    }
}
