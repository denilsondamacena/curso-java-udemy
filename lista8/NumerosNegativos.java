import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;

        System.out.print("Informe a quantidade de valores: ");
        quantidade = sc.nextInt();

        int[] valores = new int[quantidade];

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {
            System.out.print("Digite o valor da posicao " + posicao + ": ");
            valores[posicao] = sc.nextInt();
        }

        System.out.println("\nValores menores que zero:");

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {
            if (valores[posicao] < 0) 
            {
                System.out.println(valores[posicao]);
            }
        }

        sc.close();
    }
}