import java.util.Locale;
import java.util.Scanner;

public class exercicio_2_area_circulo{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, pi, raio;
        
        System.out.print("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();

        pi = 3.14159;
        area = pi * Math.pow (raio, 2);
        
        System.out.printf("Área do círculo: %.4f%n", area);


        sc.close();

    }
}