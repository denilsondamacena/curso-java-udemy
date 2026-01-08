import java.util.Locale;
import java.util.Scanner;

public class exercicio_6_calculo_area_formas_geometricas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        c = sc.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("Área triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Área círculo: %.3f%n", areaCirculo);
        System.out.printf("Área trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Área quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Área retângulo: %.3f%n", areaRetangulo);

        sc.close();
    }
    
}
