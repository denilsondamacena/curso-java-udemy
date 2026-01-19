import java.util.Locale;
import java.util.Scanner;

public class exercicio_13_dados_pessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double maiorAltura;
        double menorAltura;
        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            alturas[i] = sc.nextDouble();

            System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
            generos[i] = sc.next().charAt(0);

            if (generos[i] == 'F' || generos[i] == 'f') {
                somaAlturaMulheres += alturas[i];
                contMulheres++;
            } 
            else if (generos[i] == 'M' || generos[i] == 'm') {
                contHomens++;
            }
        }

        maiorAltura = alturas[0];
        menorAltura = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        double mediaMulheres = 0.0;
        if (contMulheres > 0) {
            mediaMulheres = somaAlturaMulheres / contMulheres;
        }

        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaMulheres);
        System.out.println("Número de homens = " + contHomens);

        sc.close();
    }
}
