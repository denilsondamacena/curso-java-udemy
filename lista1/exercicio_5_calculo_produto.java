import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_calculo_produto {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double valorPeca1, valorPeca2, resultado;

        System.out.print("Digite o código da peça 1: ");
        codigoPeca1 = sc.nextInt();
        System.out.print("Digite a quantidade de peças 1: ");
        quantidadePeca1 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        valorPeca1 = sc.nextDouble();
        System.out.print("Digite o código da peça 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.print("Digite a quantidade de peças 2: ");
        quantidadePeca2 = sc.nextInt();
        System.out.print("Digite o valor unitáiro da peça 2: ");
        valorPeca2 = sc.nextDouble();

        resultado = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("Valor a pagar: R$ %.2f", resultado);

        sc.close();
    }
    
}
