import java.util.Locale;
import java.util.Scanner;

public class exercicio_9_pessoa_mais_velha 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int maiorIdade;
        int indiceMaisVelho;

        System.out.print("Digite a quantidade de pessoas: ");
        quantidade = sc.nextInt();

        String[] pessoas = new String[quantidade];
        int[] idades = new int[quantidade];

        for (int posicao = 0; posicao < quantidade; posicao++) 
        {

            System.out.println("Cadastro da pessoa " + (posicao + 1) + ":");

            System.out.print("Informe o nome: ");
            pessoas[posicao] = sc.next();

            System.out.print("Informe a idade: ");
            idades[posicao] = sc.nextInt();
        }

        maiorIdade = idades[0];
        indiceMaisVelho = 0;

        for (int posicao = 1; posicao < quantidade; posicao++) 
        {
            if (idades[posicao] > maiorIdade) 
            {
                maiorIdade = idades[posicao];
                indiceMaisVelho = posicao;
            }
        }

        System.out.printf("Pessoa com maior idade: %s\n", pessoas[indiceMaisVelho]);

        sc.close();
    }
}