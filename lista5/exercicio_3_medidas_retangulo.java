package lista5;

import java.util.Locale;
import java.util.Scanner;
import lista5.entities.Rectangle;

public class exercicio_3_medidas_retangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Digite a largura do retângulo: ");
        rect.width = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        rect.height = sc.nextDouble();

        System.out.printf("Área: %.2f%n", rect.area());
        System.out.printf("Perímetro: %.2f%n", rect.perimeter());
        System.out.printf("Diagonal: %.2f%n", rect.diagonal());

        sc.close();
    }
}