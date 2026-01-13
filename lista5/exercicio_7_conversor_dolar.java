package lista5;

import java.util.Locale;
import java.util.Scanner;
import lista5.entities.CurrencyConverter;
    
public class exercicio_7_conversor_dolar {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Qual o valor do dólar? ");
        double dollarPrice = sc.nextDouble();
    
        System.out.print("Quantos dólares você quer comprar? ");
        double amount = sc.nextDouble();
    
        double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
    
        System.out.printf("Valor a ser pago em reais = %.2f%n", result);
    
        sc.close();
    }
}
