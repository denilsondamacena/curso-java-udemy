import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double somaAlturas = 0.0;
        int contMenores16 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            somaAlturas += alturas[i];

            if (idades[i] < 16) {
                contMenores16++;
            }
        }

        double alturaMedia = somaAlturas / n;

        double porcentagem = (contMenores16 * 100.0) / n;

        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
