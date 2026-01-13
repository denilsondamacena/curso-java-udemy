package lista5;

import java.util.Locale;
import java.util.Scanner;
import lista5.entities.Student;

public class exercicio_5_calculo_media {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.name = sc.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Nota final = %.2f%n", student.finalGrade());

        if (student.pass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Necessário %.2f pontos%n", student.missingPoints());
        }

        sc.close();
    }
    
}
