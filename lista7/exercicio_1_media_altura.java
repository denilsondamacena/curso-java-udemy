import java.util.Locale;
import java.util.Scanner;

public class exercicio_1_media_altura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            soma += alturas[i];
        }

        double media = soma / n;

        System.out.printf("Altura média = %.2f%n", media);

        sc.close();
    }
}
