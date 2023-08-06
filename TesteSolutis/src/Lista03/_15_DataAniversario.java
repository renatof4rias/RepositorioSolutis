package Lista03;

import java.util.Scanner;

public class _15_DataAniversario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número do dia: ");
		int dia = sc.nextInt();

		System.out.print("Digite o número do mês: ");
		int mes = sc.nextInt();

		boolean dataValida = true;
		String nomeMes = "";

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
				if (dia < 1 || dia > 28) {
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
			switch (mes) {
			case 1:
				nomeMes = "janeiro";
				break;
			case 2:
				nomeMes = "fevereiro";
				break;
			case 3:
				nomeMes = "março";
				break;
			case 4:
				nomeMes = "abril";
				break;
			case 5:
				nomeMes = "maio";
				break;
			case 6:
				nomeMes = "junho";
				break;
			case 7:
				nomeMes = "julho";
				break;
			case 8:
				nomeMes = "agosto";
				break;
			case 9:
				nomeMes = "setembro";
				break;
			case 10:
				nomeMes = "outubro";
				break;
			case 11:
				nomeMes = "novembro";
				break;
			case 12:
				nomeMes = "dezembro";
				break;
			}
			System.out.println("Data válida! Mês: " + nomeMes);
		} else {
			System.out.println("Data inválida!");
		}

		sc.close();
	}
}