import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_2_media_preco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
            soma += price;
        }

        double media = soma / n;

        System.out.printf("Preço médio = %.2f%n", media);

        sc.close();
    }
}
