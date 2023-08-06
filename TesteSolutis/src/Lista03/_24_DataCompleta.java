package Lista03;

import java.util.Scanner;

public class _24_DataCompleta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número do dia: ");
		int dia = sc.nextInt();

		System.out.print("Digite o número do mês: ");
		int mes = sc.nextInt();

		System.out.print("Digite o número do ano: ");
		int ano = sc.nextInt();

		boolean dataValida = true;

		if (mes < 1 || mes > 12) {
			dataValida = false;
		} else {
			switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia < 1 || dia > 30) {
					dataValida = false;
				}
				break;
			case 2:
				if (dia < 1 || dia > 29) {
					dataValida = false;
				} else if (dia == 29 && !isAnoBissexto(ano)) {
					dataValida = false;
				}
				break;
			default:
				if (dia < 1 || dia > 31) {
					dataValida = false;
				}
			}
		}

		if (dataValida) {
			System.out.println("Data válida!");
		} else {
			System.out.println("Data inválida!");
		}

		sc.close();
	}

	public static boolean isAnoBissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
	}
}
