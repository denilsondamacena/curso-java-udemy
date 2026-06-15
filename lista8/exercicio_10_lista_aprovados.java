import java.util.Locale;
import java.util.Scanner;

public class exercicio_10_lista_aprovados 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double mediaAluno;

        System.out.print("Informe a quantidade de alunos: ");
        quantidade = sc.nextInt();

        String[] alunos = new String[quantidade];
        double[] primeiraNota = new double[quantidade];
        double[] segundaNota = new double[quantidade];

        for (int indice = 0; indice < quantidade; indice++) 
        {

            System.out.println("Dados do aluno " + (indice + 1) + ":");

            sc.nextLine();

            System.out.print("Nome: ");
            alunos[indice] = sc.nextLine();

            System.out.print("Primeira nota: ");
            primeiraNota[indice] = sc.nextDouble();

            System.out.print("Segunda nota: ");
            segundaNota[indice] = sc.nextDouble();
        }

        System.out.println("\nAlunos que foram aprovados:");

        for (int indice = 0; indice < quantidade; indice++) 
        {

            mediaAluno = (primeiraNota[indice] + segundaNota[indice]) / 2;

            if (mediaAluno >= 6.0) 
            {
                System.out.println(alunos[indice]);
            }
        }

        sc.close();
    }
}