package Lista03;

import java.util.Scanner;

public class _64_Triangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de triângulos: ");
		int triangulos = sc.nextInt();

		for (int i = 1; i <= triangulos; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
