package lista2;

import java.util.Scanner;

public class exercicio_2_impar_ou_par {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        String resultado;

        if ( num % 2 == 0){
            resultado = "Par";
        }
        else{
            resultado = "Impar";
        }

        System.out.print(resultado);
        
        sc.close();
    }
    
}
