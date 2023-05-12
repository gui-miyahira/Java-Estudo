import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vnulos = 0;
        int vbranco = 0;
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int numero = -1;

        while(numero != 0){
            System.out.println(" 1 - Candidato Jeremias. \n 2 - Candidato  Bruno. \n 3 - Candidato Vinicius. \n 4 - Candidato Moraes. \n 5 - Nulo. \n 6 - Voto em branco. \n 0 - Stop.");
            numero = entrada.nextInt();
            if(numero > 6){
                System.out.println("Erro, digite um número válido!");
            }
            switch(numero){
                case 0: 
                break;

                case 1:
                    votos1 ++;
                    break;
                case 2:
                    votos2 ++;
                    break;
                case 3:
                    votos3 ++;
                    break;
                case 4:
                    votos4 ++;
                    break;
                case 5:
                    vnulos ++;
                    break;
                case 6:
                    vbranco ++;
                    break;
            }
        }
            System.out.println("Total de votos nulos:" +vnulos);
            System.out.println("Total de votos brancos:" +vbranco);
            System.out.println("Total de votos para o Candidato 1:" + votos1);
            System.out.println("Total de votos para o Candidato 2:" + votos2);
            System.out.println("Total de votos para o Candidato 3:" + votos3);
            System.out.println("Total de votos para o Candidato 4:" + votos4);
            

        

    }
    
}
