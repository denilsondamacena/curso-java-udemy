package lista5;

import java.util.Locale;
import java.util.Scanner;
import lista5.entities.Employees;

public class exercicio_4_salario_liquido {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employees emp = new Employees();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();

        System.out.print("Salário Bruto: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.printf("Funcionário: %s, R$ %.2f%n", emp.name, emp.netSalary());

        System.out.println();
        System.out.print("Qual a porcentagem de aumento no salário? ");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Dados atualizados: %s, R$ %.2f%n", emp.name, emp.netSalary());

        sc.close();
    }
}