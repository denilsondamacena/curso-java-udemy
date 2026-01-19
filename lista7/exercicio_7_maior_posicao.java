import java.util.Locale;
import java.util.Scanner;

public class exercicio_7_maior_posicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double maior = vect[0];
        int posicao = 0;

        for (int i = 1; i < n; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.printf("Maior valor = %.1f%n", maior);
        System.out.println("Posição do maior valor = " + posicao);

        sc.close();
    }
}
