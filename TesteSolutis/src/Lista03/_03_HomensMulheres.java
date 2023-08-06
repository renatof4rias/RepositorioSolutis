package Lista03;

import java.util.Scanner;

public class _03_HomensMulheres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de homens na turma: ");
		int qtdHomens = sc.nextInt();

		System.out.print("Digite a quantidade de mulheres na turma: ");
		int qtdMulheres = sc.nextInt();

		int totalAlunos = qtdHomens + qtdMulheres;
		double percentualHomens = ((double) qtdHomens / totalAlunos) * 100;
		double percentualMulheres = ((double) qtdMulheres / totalAlunos) * 100;

		System.out.println("Percentual de homens na turma: " + percentualHomens + "%");
		System.out.println("Percentual de mulheres na turma: " + percentualMulheres + "%");

		sc.close();
	}
}
