package Lista03;

import java.util.Scanner;

public class _55_Operadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double VALOR_PLANO = 50.00;
		final int MINUTOS_INCLUSOS = 100;
		final int MINUTOS_VAI_VAI = 50;
		final double VALOR_MINUTO_OUTRAS_OPERADORAS = 0.65;
		final double VALOR_MINUTO_VAI_VAI = 0.20;
		final double VALOR_MINUTO_TELEFONE_FIXO = VALOR_MINUTO_OUTRAS_OPERADORAS / 2;

		char tipoLigacao;
		int minutos;
		double saldo = VALOR_PLANO;
		boolean maisLigacoes = true;

		System.out.println("Bem-vindo à operadora Vai-Vai!");

		while (maisLigacoes) {
			System.out.print("Digite o tipo de ligação (o = outras operadoras, v = Vai-Vai, f = telefone fixo): ");
			tipoLigacao = sc.next().charAt(0);

			System.out.print("Digite a quantidade de minutos: ");
			minutos = sc.nextInt();

			double valorPagar = 0;

			switch (tipoLigacao) {
			case 'o':
				valorPagar = (minutos > MINUTOS_INCLUSOS)
						? (minutos - MINUTOS_INCLUSOS) * VALOR_MINUTO_OUTRAS_OPERADORAS
						: 0;
				break;
			case 'v':
				valorPagar = (minutos > MINUTOS_INCLUSOS + MINUTOS_VAI_VAI)
						? (minutos - (MINUTOS_INCLUSOS + MINUTOS_VAI_VAI)) * VALOR_MINUTO_VAI_VAI
						: 0;
				break;
			case 'f':
				valorPagar = (minutos > MINUTOS_INCLUSOS) ? (minutos - MINUTOS_INCLUSOS) * VALOR_MINUTO_TELEFONE_FIXO
						: 0;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}

			saldo -= valorPagar;

			System.out.println("Saldo: R$" + saldo);
			System.out.println("Valor a pagar: R$" + valorPagar);

			System.out.print("Deseja fazer mais ligações? (S/N): ");
			char resposta = sc.next().charAt(0);
			maisLigacoes = (resposta == 'S' || resposta == 's');
		}

		System.out.println("Obrigado por utilizar a operadora Vai-Vai!");

		sc.close();
	}
}
