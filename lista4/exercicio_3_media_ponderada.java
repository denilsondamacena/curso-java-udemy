package lista4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3_media_ponderada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número de casa de testes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o primeiro valor: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double b = sc.nextDouble();
            System.out.print("Digite o terceiro valor: ");
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
