package Lista03;

import java.util.Scanner;

public class _21_EmprestimoPossivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o cargo do funcionário (Diretoria, Gerência ou Operacional): ");
		String cargo = sc.nextLine();

		System.out.print("Digite o salário do funcionário: ");
		double salario = sc.nextDouble();

		double percentualEmprestimo;

		if (cargo.equalsIgnoreCase("Diretoria")) {
			percentualEmprestimo = 0.3;
		} else if (cargo.equalsIgnoreCase("Gerência")) {
			percentualEmprestimo = 0.25;
		} else if (cargo.equalsIgnoreCase("Operacional")) {
			percentualEmprestimo = 0.2;
		} else {
			System.out.println("Cargo inválido!");
			sc.close();
			return;
		}

		double valorEmprestimo = salario * percentualEmprestimo;

		System.out.println("O funcionário de cargo " + cargo + " pode obter um empréstimo de R$ " + valorEmprestimo);

		sc.close();
	}
}
