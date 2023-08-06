package Lista03;

import java.util.Scanner;

public class _48_Aluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de notas para cálculo da média semestral: ");
		int quantidadeNotas = sc.nextInt();

		double somaNotas = 0;

		for (int i = 1; i <= quantidadeNotas; i++) {
			System.out.print("Digite a nota " + i + ": ");
			double nota = sc.nextDouble();
			somaNotas += nota;
		}

		double media = somaNotas / quantidadeNotas;

		System.out.print("Digite a quantidade de faltas do aluno: ");
		int faltas = sc.nextInt();

		if (media >= 7.0 && faltas <= 20) {
			System.out.println("O aluno está aprovado.");
		} else if (media >= 4.0 && media < 7.0 && faltas <= 20) {
			System.out.println("O aluno está em recuperação.");
		} else {
			System.out.println("O aluno está reprovado.");
		}

		sc.close();
	}
}
