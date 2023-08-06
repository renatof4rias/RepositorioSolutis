package Lista03;

import java.util.Scanner;

public class _09_MaiorIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {
			System.out.println("Menor de idade!");
		}

		sc.close();
	}
}
