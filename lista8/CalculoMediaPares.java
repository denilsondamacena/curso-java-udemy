import java.util.Locale;
import java.util.Scanner;

public class CalculoMediaPares 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int somaPares = 0;
        int totalPares = 0;
        double mediaPares;

        System.out.print("Informe a quantidade de elementos do vetor: ");
        quantidade = sc.nextInt();

        int[] valores = new int[quantidade];

        for (int indice = 0; indice < quantidade; indice++) 
        {
            System.out.print("Digite um valor: ");
            valores[indice] = sc.nextInt();
        }

        for (int indice = 0; indice < quantidade; indice++) 
        {
            if (valores[indice] % 2 == 0) 
            {
                somaPares += valores[indice];
                totalPares++;
            }
        }

        if (totalPares == 0) 
        {
            System.out.println("Nao existem valores pares");
        } 
        else 
        {
            mediaPares = (double) somaPares / totalPares;

            System.out.printf("Media dos valores pares = %.1f\n", mediaPares);
        }

        sc.close();
    }
}