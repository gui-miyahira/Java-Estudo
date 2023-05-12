import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matricula, nota1, nota2, nota3, numaprovados = 0, numreprovados = 0;
        float media, mediageral, total = 0, freq = 0, maiormedia = 0, menormedia = 10;

        for(int i=1;i<= 10;i++){

            System.out.println(i + "- Digite o número da sua matrícula: ");
            matricula = entrada.nextInt();
            System.out.println("Digite a sua nota 1: ");
            nota1 = entrada.nextInt();
            System.out.println("Digite a sua nota 2: ");
            nota2 = entrada.nextInt();
            System.out.println("Digite a sua nota  3: ");
            nota3 = entrada.nextInt();
            System.out.println("Digite a sua frequência nas aulas em %:");
            freq = entrada.nextInt();
            
            media = (nota1 + nota2 + nota3)/3;
            total = total + media;

            System.out.println("Sua matrícula: "+ matricula);
            System.out.println("Sua média: " + media);
            System.out.println("Frequencia nas aulas: "+ freq + "%");

            if( media >= 6 && freq >= 75){
                System.out.println("Você está APROVADO!");
               numaprovados++;
            }
            else{
                System.out.println("Você está REPROVADO!");
                numreprovados++;
            }

            if(media > maiormedia){
                maiormedia = media;
            }
            if (media < menormedia){
                menormedia = media;
            }
        }

        mediageral = total/10;

        System.out.println("A média geral dos alunos ficou: "+ mediageral);
        System.out.println("A maior média da turma é:"+ maiormedia);
        System.out.println("A menor média da turma é:"+ menormedia);
        System.out.println("O número de aprovados é:"+ numaprovados);
        System.out.println("O número de reprovados é:"+ numreprovados);
    }
    
}
