import java.util.Scanner;

public class exercicio_10_media_pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int somaPares = 0;
        int contPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                somaPares += vect[i];
                contPares++;
            }
        }

        if (contPares == 0) {
            System.out.println("Nenhum número par");
        } else {
            double media = (double) somaPares / contPares;
            System.out.printf("Média dos pares = %.1f%n", media);
        }

        sc.close();
    }
}
