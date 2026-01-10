package lista4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4_lista_divisao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pares: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Digite o numerador: ");
            double a = sc.nextDouble();

            System.out.print("Digite o denominador: ");
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.println("divisão impossivel");
            } else {
                double resultado = a / b;
                System.out.printf("%.1f%n", resultado);
            }
        }

        sc.close();
    }
}
