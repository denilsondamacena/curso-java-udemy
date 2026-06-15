import java.util.Locale;
import java.util.Scanner;

public class CalculoVetor 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double total = 0;
        double media;

        System.out.print("Informe quantos valores serao informados: ");
        quantidade = sc.nextInt();

        double[] numeros = new double[quantidade];

        for (int indice = 0; indice < quantidade; indice++) 
        {
            System.out.print("Digite o valor " + (indice + 1) + ": ");
            numeros[indice] = sc.nextDouble();
        }

        for (int indice = 0; indice < quantidade; indice++) 
        {
            total += numeros[indice];
        }

        media = total / quantidade;

        System.out.print("Valores digitados: ");

        for (int indice = 0; indice < quantidade; indice++) 
        {
            System.out.printf("%.1f ", numeros[indice]);
        }

        System.out.printf("\nResultado da soma = %.2f\n", total);
        System.out.printf("Media dos valores = %.2f\n", media);

        sc.close();
    }
}