import java.util.Locale;
import java.util.Scanner;

public class exercicio_0_2_desconto {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        double precofinal =  preco - desconto;

        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço final: R$ %.2f%n", precofinal);

        sc.close();
    }
    
}
