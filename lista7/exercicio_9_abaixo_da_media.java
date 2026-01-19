import java.util.Locale;
import java.util.Scanner;

public class exercicio_9_abaixo_da_media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("Média do vetor = %.3f%n", media);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < n; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        sc.close();
    }
}
