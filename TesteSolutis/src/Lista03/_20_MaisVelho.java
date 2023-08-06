package Lista03;

import java.util.Scanner;

public class _20_MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da primeira pessoa: ");
		String nome1 = sc.nextLine();

		System.out.print("Digite a idade da primeira pessoa: ");
		int idade1 = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

		System.out.print("Digite o nome da segunda pessoa: ");
		String nome2 = sc.nextLine();

		System.out.print("Digite a idade da segunda pessoa: ");
		int idade2 = sc.nextInt();

		if (idade1 < idade2) {
			System.out.println("A pessoa mais nova é: " + nome1);
			System.out.println("A pessoa mais velha é: " + nome2);
		} else if (idade1 > idade2) {
			System.out.println("A pessoa mais nova é: " + nome2);
			System.out.println("A pessoa mais velha é: " + nome1);
		} else {
			System.out.println("As duas pessoas têm a mesma idade.");
		}

		sc.close();
	}
}