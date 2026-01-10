package lista4;

import java.util.Scanner;

public class exercicio_7_quadrado_cubo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}
