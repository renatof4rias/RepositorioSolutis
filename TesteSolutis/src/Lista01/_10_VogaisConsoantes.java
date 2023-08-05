package Lista01;

import java.util.Scanner;

public class _10_VogaisConsoantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Entrada
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		int vogais = 0;
		int consoantes = 0;
		int espacos = 0;
//Transformar a Frase toda em minuscula
		frase = frase.toLowerCase();
//Contador de vogais e consoantes, juntamente ao espacos em branco
		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);

			if (caractere >= 'a' && caractere <= 'z') {
				if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
					vogais++;
				} else {
					consoantes++;
				}
			} else if (Character.isWhitespace(caractere)) {
				espacos++;
			}
		}
		System.out.println("Quantidade de vogais: " + vogais);
		System.out.println("Quantidade de consoantes: " + consoantes);
		System.out.println("Quantidade de espaços em branco: " + espacos);
		sc.close();
	}
}