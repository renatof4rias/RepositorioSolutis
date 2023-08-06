package Lista03;

import java.util.Scanner;

public class _13_NotaAlunoPT2 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite a primeira nota: ");
		        double nota1 = sc.nextDouble();

		        System.out.print("Digite a segunda nota: ");
		        double nota2 = sc.nextDouble();

		        System.out.print("Digite a terceira nota: ");
		        double nota3 = sc.nextDouble();

		        double media = (nota1 + nota2 + nota3) / 3;

		        if (media >= 7.0) {
		            System.out.println("Aluno aprovado!");
		        } else if (media >= 5.0) {
		            System.out.println("Aluno de recuperação. Pode fazer prova final!");
		            System.out.print("Digite a nota da prova final: ");
		            double notaFinal = sc.nextDouble();

		            media = (media + notaFinal) / 2;

		            if (media >= 5.0) {
		                System.out.println("Aluno aprovado após a prova final!");
		            } else {
		                System.out.println("Aluno reprovado após a prova final!");
		            }
		        } else {
		            System.out.println("Aluno reprovado!");
		        }

		        sc.close();
		    }
}
