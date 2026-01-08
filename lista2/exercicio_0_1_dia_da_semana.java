package lista2;

import java.util.Scanner;

public class exercicio_0_1_dia_da_semana {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número de 1-7: ");
        int x = sc.nextInt();
        String dia;

        dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Valor inválido!";
        };

        System.out.printf("Dia da semana: " + dia);

        sc.close();
    }
    
}
