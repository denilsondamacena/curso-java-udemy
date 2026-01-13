package lista5;

import java.util.Locale;
import java.util.Scanner;

import lista5.entities.Product;

public class exercicio_2_estoque {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        product.nome = sc.nextLine();
        System.out.print("Preço: ");
        product.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Digite a quantidade de produtos para adicionar no estoque: ");
        int quantidade = sc.nextInt();
        product.AdicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Digite a quantidade de produtos para remover do estoque: ");
        quantidade = sc.nextInt();
        product.RemoverProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
