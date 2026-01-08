package lista2;

import java.util.Scanner;

public class exercicio_4_duracao_jogo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }
    
}
