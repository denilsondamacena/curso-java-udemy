package lista2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_cardapio {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o código do item: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double preco = 0.0;

       switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return;
       }

        double total = preco * quantidade;
        
        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
    }
    
}
