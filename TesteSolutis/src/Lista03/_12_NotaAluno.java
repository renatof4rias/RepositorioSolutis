package Lista03;

import java.util.Scanner;

public class _12_NotaAluno {

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
			System.out.println("Aluno de recuperação!");
		} else {
			System.out.println("Aluno reprovado!");
		}

		sc.close();
	}
}
