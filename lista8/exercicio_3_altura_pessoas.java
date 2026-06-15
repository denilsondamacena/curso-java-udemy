import java.util.Locale;
import java.util.Scanner;

public class exercicio_3_altura_pessoas
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int menoresDezesseis;
        double somaAlturas;
        double mediaAlturas;
        double porcentagemMenores;

        System.out.print("Digite a quantidade de pessoas: ");
        quantidade = sc.nextInt();

        String[] pessoas = new String[quantidade];
        int[] idades = new int[quantidade];
        double[] alturas = new double[quantidade];

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {

            System.out.println("Informacoes da pessoa " + (posicao + 1) + ":");

            System.out.print("Nome: ");
            pessoas[posicao] = sc.next();

            System.out.print("Idade: ");
            idades[posicao] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[posicao] = sc.nextDouble();
        }

        menoresDezesseis = 0;
        somaAlturas = 0;

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {

            if (idades[posicao] < 16) {
                menoresDezesseis++;
            }

            somaAlturas += alturas[posicao];
        }

        mediaAlturas = somaAlturas / quantidade;
        porcentagemMenores = ((double) menoresDezesseis / quantidade) * 100;

        System.out.printf("\nAltura media das pessoas = %.2f\n", mediaAlturas);
        System.out.printf("Percentual de pessoas menores de 16 anos: %.1f%%\n", porcentagemMenores);

        System.out.println("Pessoas com idade inferior a 16 anos:");

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {

            if (idades[posicao] < 16) 
            {
                System.out.println(pessoas[posicao]);
            }
        }

        sc.close();
    }
}