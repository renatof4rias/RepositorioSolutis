package Lista03;

import java.util.Scanner;

public class _65_PiramideAsteristicos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linhas = sc.nextInt();

		int espacos = linhas - 1;
		for (int i = 1; i <= linhas; i++) {
			for (int j = 1; j <= espacos; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			espacos--;
		}
		sc.close();
	}
}
