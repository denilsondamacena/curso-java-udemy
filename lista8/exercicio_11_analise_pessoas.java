import java.util.Locale;
import java.util.Scanner;

public class exercicio_11_analise_pessoas 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int totalHomens;
        int totalMulheres;

        double menorAltura;
        double maiorAltura;
        double mediaAlturaMulheres;
        double somaAlturaMulheres;

        System.out.print("Informe a quantidade de pessoas: ");
        quantidade = sc.nextInt();

        double[] listaAlturas = new double[quantidade];
        char[] listaGeneros = new char[quantidade];

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {

            System.out.print("Digite a altura da pessoa " + (posicao + 1) + ": ");
            listaAlturas[posicao] = sc.nextDouble();

            System.out.print("Digite o genero da pessoa " + (posicao + 1) + ": ");
            listaGeneros[posicao] = sc.next().charAt(0);
        }

        menorAltura = listaAlturas[0];
        maiorAltura = listaAlturas[0];

        for (int posicao = 1; posicao < quantidade; posicao++) 
        {

            if (listaAlturas[posicao] > maiorAltura) 
            {
                maiorAltura = listaAlturas[posicao];
            }

            if (listaAlturas[posicao] < menorAltura) 
            {
                menorAltura = listaAlturas[posicao];
            }
        }

        totalHomens = 0;
        totalMulheres = 0;
        somaAlturaMulheres = 0;

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {

            if (listaGeneros[posicao] == 'M') 
            {
                totalHomens++;
            }
            else 
            {
                totalMulheres++;
                somaAlturaMulheres += listaAlturas[posicao];
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;

        System.out.printf("Menor altura registrada = %.2f\n", menorAltura);
        System.out.printf("Maior altura registrada = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas femininas = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Quantidade de homens = %d\n", totalHomens);

        sc.close();
    }
}