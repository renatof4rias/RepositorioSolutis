package Lista03;

import java.util.Scanner;

public class _05_ValorDivida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor inicial da dívida: ");
		double valorInicial = sc.nextDouble();

		System.out.print("Digite a quantidade de meses: ");
		int quantidadeMeses = sc.nextInt();

		System.out.print("Digite o valor dos juros mensais (em decimal): ");
		double jurosMensais = sc.nextDouble();

		double valorFinal = valorInicial * (1 + jurosMensais * quantidadeMeses);
		System.out.println("O valor final da dívida é: " + valorFinal);

		sc.close();
	}
}
