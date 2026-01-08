package lista2;

import java.util.Scanner;

public class exercicio_3_multiplos {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a, b;
    System.out.print("Digite o primeiro número: ");
    a = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    b = sc.nextInt();

    String resultado;

   if (a % b == 0 || b % a == 0){
    resultado = "São múltiplos";
   }
   else{
    resultado = "Não são múltiplos";
   }

    System.out.print(resultado);

    sc.close();
    }
    
}
