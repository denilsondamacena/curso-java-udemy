import java.util.Locale;
import java.util.Scanner;

public class exercicio_6_soma_dos_vetores 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanho;

        System.out.print("Informe o tamanho dos vetores: ");
        tamanho = sc.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] resultado = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor:");

        for (int indice = 0; indice < tamanho; indice++) 
        {
            vetorA[indice] = sc.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");

        for (int indice = 0; indice < tamanho; indice++) 
        {
            vetorB[indice] = sc.nextInt();
        }

        for (int indice = 0; indice < tamanho; indice++) 
        {
            resultado[indice] = vetorA[indice] + vetorB[indice];
        }

        System.out.println("Soma dos vetores:");

        for (int indice = 0; indice < tamanho; indice++) 
        {
            System.out.println(resultado[indice]);
        }

        sc.close();
    }
}