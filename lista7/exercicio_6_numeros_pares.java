import java.util.Scanner;

public class exercicio_6_numeros_pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int qtdPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números pares:");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                qtdPares++;
            }
        }
        System.out.println();

        System.out.println("Quantidade de pares:");
        System.out.println(qtdPares);

        sc.close();
    }
}
