package Lista03;

import java.util.Scanner;

public class _19_OrdemCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();

		if (num1 < num2) {
			System.out.println("Os números em ordem crescente: " + num1 + ", " + num2);
		} else {
			System.out.println("Os números em ordem crescente: " + num2 + ", " + num1);
		}

		sc.close();
	}
}
