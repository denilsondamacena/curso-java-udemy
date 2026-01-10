package lista3;

import java.util.Scanner;

public class exercicio_2_coordenadas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x, y;

        while (true) {
            System.out.print("Digite X: ");
            x = sc.nextInt();
            System.out.print("Digite Y: ");
            y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }
        }

        sc.close();
    }
    
}
