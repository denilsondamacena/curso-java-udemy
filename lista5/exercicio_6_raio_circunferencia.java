package lista5;

import java.util.Locale;
import java.util.Scanner;
import lista5.entities.Calculator;

public class exercicio_6_raio_circunferencia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

        sc.close();
    }
    
}
