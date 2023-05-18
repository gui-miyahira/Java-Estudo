import java.util.Scanner;
public class ex5 {

    static void calculaHora( int x){
        Scanner entrada = new Scanner(System.in);

        int hora, minutos, segundos, tempototal;
        if ( x > 3 || x < 0){
            System.out.println("Numero invalido!");
        }else{
        switch(x){
            case 1:

            System.out.println("Digite as horas.");
            hora = entrada.nextInt();

            tempototal = (hora*60)*60;

            System.out.println("A quantidade de segundos presente em "+hora+" horas é:" + tempototal);
            break;
            case 2:

            System.out.println("Digite as horas.");
            hora = entrada.nextInt();
            System.out.println("Digite os minutos:");
            minutos = entrada.nextInt();

            tempototal = ((hora*60)*60) + (minutos * 60);

            System.out.println("A quantidade de segundos presente em " + hora + " horas e " + minutos + " minutos é:" + tempototal);
            break;
            case 3:

            System.out.println("Digite as horas.");
            hora = entrada.nextInt();
            System.out.println("Digite os minutos:");
            minutos = entrada.nextInt();
            System.out.println("Digite os segundos:");
            segundos = entrada.nextInt();

            tempototal = ((hora*60)*60) + (minutos * 60) + segundos;

            System.out.println("A quantidade de segundos presente em " + hora + " horas , " + minutos + " minutos e "+segundos+ " segundos é:" + tempototal);
            
        }
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Conversão para segundos:");
        System.out.println(" Digite 1 - Horas. \n Digite 2 - Horas e minutos. \n Digite 3 - Horas, minutos e segundos.");
        x = entrada.nextInt();

        calculaHora(x);

        


    }

    
}
