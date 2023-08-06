package Lista03;

import java.util.Scanner;

public class _36_ImparesExistentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();

		int inicio = Math.min(numero1, numero2);
		int fim = Math.max(numero1, numero2);

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}
