import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_encontrar_maior_valor 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int indiceMaior;
        double maiorValor;

        System.out.print("Digite a quantidade de numeros: ");
        quantidade = sc.nextInt();

        double[] numeros = new double[quantidade];

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {
            System.out.print("Informe um numero: ");
            numeros[posicao] = sc.nextDouble();
        }

        maiorValor = numeros[0];
        indiceMaior = 0;

        for (int posicao = 1; posicao < quantidade; posicao++) 
        {

            if (numeros[posicao] > maiorValor) 
            {
                maiorValor = numeros[posicao];
                indiceMaior = posicao;
            }
        }

        System.out.printf("Maior numero encontrado = %.1f\n", maiorValor);
        System.out.printf("Posicao do maior numero = %d\n", indiceMaior);

        sc.close();
    }
}