import java.util.Scanner;
public class teste2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    int i, j, m[][] = new int[4][4];

    for (i=0; i < m.length; i++) {
      System.out.println("Informe os elementos "+(i+1)+"a. linha:");

      for (j=0; j < m[i].length; j++) {
        System.out.println("m["+i+"]["+j+"] = ");
        m[i][j] = entrada.nextInt();
      }

    }
    System.out.println("Diagonal principal:");
    for (i=0; i < m.length; i++) {

      for (j=0; j < m[i].length; j++) {
        
        if(i == j){
            System.out.println("m["+i+"]["+j+"] = "+m[i][j]);
        }
      }
    }

    }
}
