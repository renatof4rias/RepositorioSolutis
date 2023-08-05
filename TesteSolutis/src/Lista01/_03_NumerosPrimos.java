package Lista01;

import java.util.Scanner;

public class _03_NumerosPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		System.out.println("Números primos menores que " + numero + ":");

		for (int i = 2; i < numero; i++) {
			if (ehPrimo(i)) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

	public static boolean ehPrimo(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
