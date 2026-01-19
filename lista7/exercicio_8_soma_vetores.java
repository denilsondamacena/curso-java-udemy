import java.util.Scanner;

public class exercicio_8_soma_vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.print("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }

        sc.close();
    }
}
