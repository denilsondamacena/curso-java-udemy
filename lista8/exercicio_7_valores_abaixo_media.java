import java.util.Locale;
import java.util.Scanner;

public class exercicio_7_valores_abaixo_media 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double somaValores;
        double mediaValores;

        System.out.print("Digite a quantidade de valores do vetor: ");
        quantidade = sc.nextInt();

        double[] numeros = new double[quantidade];

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {
            System.out.print("Informe um valor: ");
            numeros[posicao] = sc.nextDouble();
        }

        somaValores = 0;

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {
            somaValores += numeros[posicao];
        }

        mediaValores = somaValores / quantidade;

        System.out.printf("\nMedia dos valores = %.3f\n", mediaValores);
        System.out.println("Numeros menores que a media:");

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {
            if (numeros[posicao] < mediaValores) 
            {
                System.out.printf("%.1f\n", numeros[posicao]);
            }
        }

        sc.close();
    }
}