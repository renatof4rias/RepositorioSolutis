package Lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _54_RealToDollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor inicial em reais: ");
		double valorInicial = sc.nextDouble();

		System.out.print("Digite o valor final em reais: ");
		double valorFinal = sc.nextDouble();

		System.out.print("Digite o valor de incremento em reais: ");
		double incremento = sc.nextDouble();

		System.out.print("Digite o valor de 1 dólar em reais: ");
		double valorDolar = sc.nextDouble();

		System.out.println("Tabela de conversão de reais para dólares:");

		DecimalFormat df = new DecimalFormat("#,##0.00");

		for (double valor = valorInicial; valor <= valorFinal; valor += incremento) {
			double valorEmDolar = valor / valorDolar;
			System.out.println("R$" + df.format(valor) + " = $" + df.format(valorEmDolar));
		}

		sc.close();
	}
}
