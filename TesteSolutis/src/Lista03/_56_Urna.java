package Lista03;

import java.util.Scanner;

public class _56_Urna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int NUMERO_CANDIDATOS = 3;
		String[] candidatos = new String[NUMERO_CANDIDATOS];
		int[] votos = new int[NUMERO_CANDIDATOS];
		int totalVotos = 0;
		int votosEmBranco = 0;

		// Preencher nomes dos candidatos
		for (int i = 0; i < NUMERO_CANDIDATOS; i++) {
			System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
			candidatos[i] = sc.nextLine();
		}

		boolean maisVotos = true;

		while (maisVotos) {
			System.out.println("VOTE EM UM DOS CANDIDATOS ABAIXO OU EM BRANCO:");
			for (int i = 0; i < NUMERO_CANDIDATOS; i++) {
				System.out.println((i + 1) + " - " + candidatos[i]);
			}
			System.out.println("0 - BRANCO");

			int voto = sc.nextInt();

			if (voto == 0) {
				votosEmBranco++;
			} else if (voto >= 1 && voto <= NUMERO_CANDIDATOS) {
				votos[voto - 1]++;
				totalVotos++;
			} else {
				System.out.println("Opção inválida. Voto anulado.");
			}

			System.out.print("Deseja continuar votando? (S/N): ");
			char resposta = sc.next().charAt(0);
			maisVotos = (resposta == 'S' || resposta == 's');
		}

		System.out.println("RESULTADO DA ELEIÇÃO:");
		for (int i = 0; i < NUMERO_CANDIDATOS; i++) {
			double percentualVotos = (totalVotos == 0) ? 0 : (votos[i] * 100.0) / totalVotos;
			System.out.println(
					candidatos[i] + ": " + votos[i] + " votos (" + String.format("%.2f", percentualVotos) + "%)");
		}

		double percentualVotosEmBranco = (totalVotos == 0) ? 0 : (votosEmBranco * 100.0) / totalVotos;
		System.out.println("Votos em branco: " + votosEmBranco + " votos ("
				+ String.format("%.2f", percentualVotosEmBranco) + "%)");

		int indiceGanhador = 0;
		for (int i = 1; i < NUMERO_CANDIDATOS; i++) {
			if (votos[i] > votos[indiceGanhador]) {
				indiceGanhador = i;
			}
		}

		if (votos[indiceGanhador] == 0) {
			System.out.println("Nenhum candidato venceu a eleição.");
		} else {
			System.out.println("O ganhador da eleição é: " + candidatos[indiceGanhador]);
		}

		sc.close();
	}
}
