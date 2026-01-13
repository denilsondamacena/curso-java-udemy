package lista5;

import java.util.Locale;
import java.util.Scanner;
import lista5.entities.Triangle;

public class exercicio_1_maior_area_triangulo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triângulo X: ");
        System.out.print("Medida xA: ");
        x.a = sc.nextDouble();
        System.out.print("Medida xB: ");
        x.b = sc.nextDouble();
        System.out.print("Medida xC: ");
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y: ");
        System.out.print("Medida yA: ");
        y.a = sc.nextDouble();
        System.out.print("Medida yB: ");
        y.b = sc.nextDouble();
        System.out.print("Medida yC: ");
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.print("Maior área: X");
        }
        else{
            System.out.print("Maior área: Y");
        }

        sc.close();
    }
}
