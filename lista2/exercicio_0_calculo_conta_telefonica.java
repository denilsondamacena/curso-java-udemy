package lista2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_0_calculo_conta_telefonica {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos minutos utilizou o telefone: ");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", conta);

        sc.close();
    }
}