package lista2;

import java.util.Scanner;

public class exercicio_1_positivo_ou_negativo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

       String resultado;

        if (num > 0) {
            resultado = "Positivo";
        } else if (num < 0) {
            resultado = "Negativo";
        } else {
            resultado = "Neutro";
        }

        System.out.print(resultado);
        
        sc.close();
    }
    
}
