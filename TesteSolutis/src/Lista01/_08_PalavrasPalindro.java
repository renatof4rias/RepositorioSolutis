package Lista01;

import java.util.Scanner;

public class _08_PalavrasPalindro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine();


		if (ehPalindromo(palavra)) {
			System.out.println("A palavra " + palavra + " é um palíndromo.");
		} else {
			System.out.println("A palavra " + palavra + " não é um palíndromo.");
		}
		sc.close();
	}

	public static boolean ehPalindromo(String palavra) {
		int esquerda = 0;
		int direita = palavra.length() - 1;

		while (esquerda < direita) {
			if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;

	}

}
