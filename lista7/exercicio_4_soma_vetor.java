import java.util.Locale;
import java.util.Scanner;

public class exercicio_4_soma_vetor {
    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();

        double media = soma / n;

        System.out.printf("Soma = %.1f%n", soma);
        System.out.printf("Média = %.2f%n", media);

        sc.close();
    }
}
