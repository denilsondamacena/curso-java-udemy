import java.util.Locale;
import java.util.Scanner;

public class exercicio_0_area_terreno {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        double largura, comprimento, metroQuadrado;

        System.out.print("Digite a largura do terreno: ");
        largura =  sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento  = sc.nextDouble();
        System.out.print("Digite o preço do metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Área = %.2f%n", area);
        System.out.printf("Preço = %.2f%n", preco);
        
        sc.close();

    }
}