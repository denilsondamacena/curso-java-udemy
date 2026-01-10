package lista3;

import java.util.Scanner;

public class exercicio_1_verificar_senha {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.print("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida!");
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}