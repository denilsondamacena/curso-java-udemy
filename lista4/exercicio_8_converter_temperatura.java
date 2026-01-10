package lista4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_8_converter_temperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char repetir;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);

            System.out.print("Deseja repetir (s/n)? ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's' || repetir == 'S');

        sc.close();
    }
}
