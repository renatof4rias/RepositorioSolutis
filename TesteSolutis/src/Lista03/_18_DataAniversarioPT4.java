package Lista03;

import java.util.Scanner;

public class _18_DataAniversarioPT4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número do dia de nascimento: ");
		int diaNascimento = sc.nextInt();

		System.out.print("Digite o número do mês de nascimento: ");
		int mesNascimento = sc.nextInt();

		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();

		System.out.print("Digite o número do dia de hoje: ");
		int diaHoje = sc.nextInt();

		System.out.print("Digite o número do mês de hoje: ");
		int mesHoje = sc.nextInt();

		System.out.print("Digite o ano de hoje: ");
		int anoHoje = sc.nextInt();

		boolean dataValidaNascimento = true;
		boolean dataValidaHoje = true;
		String nomeMesNascimento = "";
		String nomeMesHoje = "";

		if (mesNascimento < 1 || mesNascimento > 12) {
			dataValidaNascimento = false;
		} else {
			switch (mesNascimento) {
			case 4:
			case 6:
			case 9:
			case 11:
				if (diaNascimento < 1 || diaNascimento > 30) {
					dataValidaNascimento = false;
				}
				break;
			case 2:
				if (diaNascimento < 1 || diaNascimento > 28) {
					dataValidaNascimento = false;
				}
				break;
			default:
				if (diaNascimento < 1 || diaNascimento > 31) {
					dataValidaNascimento = false;
				}
			}
		}

		if (mesHoje < 1 || mesHoje > 12) {
			dataValidaHoje = false;
		} else {
			switch (mesHoje) {
			case 4:
			case 6:
			case 9:
			case 11:
				if (diaHoje < 1 || diaHoje > 30) {
					dataValidaHoje = false;
				}
				break;
			case 2:
				if (diaHoje < 1 || diaHoje > 28) {
					dataValidaHoje = false;
				}
				break;
			default:
				if (diaHoje < 1 || diaHoje > 31) {
					dataValidaHoje = false;
				}
			}
		}

		if (dataValidaNascimento && dataValidaHoje) {
			switch (mesNascimento) {
			case 1:
				nomeMesNascimento = "janeiro";
				break;
			case 2:
				nomeMesNascimento = "fevereiro";
				break;
			case 3:
				nomeMesNascimento = "março";
				break;
			case 4:
				nomeMesNascimento = "abril";
				break;
			case 5:
				nomeMesNascimento = "maio";
				break;
			case 6:
				nomeMesNascimento = "junho";
				break;
			case 7:
				nomeMesNascimento = "julho";
				break;
			case 8:
				nomeMesNascimento = "agosto";
				break;
			case 9:
				nomeMesNascimento = "setembro";
				break;
			case 10:
				nomeMesNascimento = "outubro";
				break;
			case 11:
				nomeMesNascimento = "novembro";
				break;
			case 12:
				nomeMesNascimento = "dezembro";
				break;
			}

			switch (mesHoje) {
			case 1:
				nomeMesHoje = "janeiro";
				break;
			case 2:
				nomeMesHoje = "fevereiro";
				break;
			case 3:
				nomeMesHoje = "março";
				break;
			case 4:
				nomeMesHoje = "abril";
				break;
			case 5:
				nomeMesHoje = "maio";
				break;
			case 6:
				nomeMesHoje = "junho";
				break;
			case 7:
				nomeMesHoje = "julho";
				break;
			case 8:
				nomeMesHoje = "agosto";
				break;
			case 9:
				nomeMesHoje = "setembro";
				break;
			case 10:
				nomeMesHoje = "outubro";
				break;
			case 11:
				nomeMesHoje = "novembro";
				break;
			case 12:
				nomeMesHoje = "dezembro";
				break;
			}

			int idade = anoHoje - anoNascimento;
			if (mesHoje < mesNascimento || (mesHoje == mesNascimento && diaHoje < diaNascimento)) {
				idade--; // ainda não fez aniversário esse ano
			}

			System.out.println(
					"Data de nascimento: " + diaNascimento + " de " + nomeMesNascimento + " de " + anoNascimento);
			System.out.println("Data de hoje: " + diaHoje + " de " + nomeMesHoje + " de " + anoHoje);
			System.out.println("Idade atual: " + idade + " anos");
		} else {
			System.out.println("Data de nascimento ou data de hoje inválida!");
		}
		sc.close();
	}
}