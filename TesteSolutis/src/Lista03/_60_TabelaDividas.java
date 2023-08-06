package Lista03;

import java.text.DecimalFormat;

public class _60_TabelaDividas {
	public static void main(String[] args) {
		DecimalFormat formatoMoeda = new DecimalFormat("#,##0.00");

		double dividaInicial = 100.00;
		double taxaCorrecao = 1.8 / 100; // 1.8%

		System.out.println("Anos Jan Fev Mar Abr Mai Jun Jul Ago Set Out Nov Dez");
		for (int ano = 2007; ano <= 2008; ano++) {
			System.out.print(ano + " ");
			for (int mes = 1; mes <= 12; mes++) {
				double dividaAtual = dividaInicial * Math.pow(1 + taxaCorrecao, (ano - 2007) * 12 + mes);
				System.out.print(formatoMoeda.format(dividaAtual) + " ");
			}
			System.out.println();
		}
	}
}
