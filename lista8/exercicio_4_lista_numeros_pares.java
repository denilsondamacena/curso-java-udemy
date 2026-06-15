import java.util.Scanner;

public class exercicio_4_lista_numeros_pares 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int totalPares;

        System.out.print("Informe quantos valores deseja inserir: ");
        quantidade = sc.nextInt();

        int[] valores = new int[quantidade];

        for (int indice = 0; indice < quantidade; indice++) 
        {
            System.out.print("Digite o valor: ");
            valores[indice] = sc.nextInt();
        }

        System.out.println("\nValores pares encontrados:");

        totalPares = 0;

        for (int indice = 0; indice < quantidade; indice++) 
        {

            if (valores[indice] % 2 == 0) 
            {
                System.out.print(valores[indice] + "  ");
                totalPares++;
            }
        }

        System.out.printf("\n\nQuantidade de numeros pares: %d\n", totalPares);

        sc.close();
    }
}