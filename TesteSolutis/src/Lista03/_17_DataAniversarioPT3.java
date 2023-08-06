package Lista03;

import java.util.Scanner;

public class _17_DataAniversarioPT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número do dia: ");
		int dia = sc.nextInt();

		System.out.print("Digite o número do mês: ");
		int mes = sc.nextInt();

		boolean dataValida = true;
		String nomeMes = "";
		String signo = "";

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

			if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
				signo = "Áries";
			} else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
				signo = "Touro";
			} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
				signo = "Gêmeos";
			} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
				signo = "Câncer";
			} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
				signo = "Leão";
			} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
				signo = "Virgem";
			} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
				signo = "Libra";
			} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
				signo = "Escorpião";
			} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
				signo = "Sagitário";
			} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
				signo = "Capricórnio";
			} else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
				signo = "Aquário";
			} else {
				signo = "Peixes";
			}

			System.out.println("Data válida! Mês: " + nomeMes + ", Signo: " + signo);
		} else {
			System.out.println("Data inválida!");
		}

		sc.close();
	}
}