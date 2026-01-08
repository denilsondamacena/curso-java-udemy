package lista2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_6_intervalo_valor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0 a 25]");
        } else if (valor > 25 && valor <= 50){
            System.out.println("Intervalo [25 a 50]");
        } else if (valor > 50 && valor <= 75){
            System.out.println("Intervalo [50 a 75]");
        } else if (valor > 75 && valor <= 100){
            System.out.println("Intervalo [75 a 100]");
        } else {
            System.out.println("Fora do intervalo.");
        }

        sc.close();
    }
    
}
