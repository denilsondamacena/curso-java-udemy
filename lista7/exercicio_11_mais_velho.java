import java.util.Scanner;

public class exercicio_11_mais_velho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maiorIdade = idades[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nomes[posicaoMaior]);

        sc.close();
    }
}
