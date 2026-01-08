import java.util.Locale;
import java.util.Scanner;

public class exercicio_4_calculo_salario {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("Digite o número do funcionário: ");
        numero = sc.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor a receber pela hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Número: %d%n", numero);
        System.out.printf("Salário: R$ %.2f", salario);

        sc.close();
    }
    
}
