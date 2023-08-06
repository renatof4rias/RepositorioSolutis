package Lista03;

import java.util.Scanner;

public class _10_Emprestimo {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o valor do salário bruto: ");
		        double salarioBruto = sc.nextDouble();

		        System.out.print("Digite o valor dos descontos: ");
		        double descontos = sc.nextDouble();

		        System.out.print("Digite o valor do possível empréstimo: ");
		        double valorEmprestimo = sc.nextDouble();

		        double salarioLiquido = salarioBruto - descontos;
		        double limiteEmprestimo = salarioLiquido * 0.3;

		        if (valorEmprestimo <= limiteEmprestimo) {
		            System.out.println("Empréstimo aprovado!");
		        } else {
		            System.out.println("Empréstimo negado! Limite máximo: R$" + limiteEmprestimo);
		        }

		        sc.close();
		    }
}
