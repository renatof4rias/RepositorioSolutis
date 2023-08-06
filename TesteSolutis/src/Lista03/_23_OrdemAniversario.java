package Lista03;

import java.util.Scanner;

public class _23_OrdemAniversario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome da primeira pessoa:");
		String nome1 = sc.nextLine();
		System.out.print("Dia de nascimento: ");
		int dia1 = sc.nextInt();
		System.out.print("Mês de nascimento: ");
		int mes1 = sc.nextInt();

		System.out.println("Digite o nome da segunda pessoa:");
		sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
		String nome2 = sc.nextLine();
		System.out.print("Dia de nascimento: ");
		int dia2 = sc.nextInt();
		System.out.print("Mês de nascimento: ");
		int mes2 = sc.nextInt();

		if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
			System.out.println("O primeiro aniversariante é: " + nome1);
		} else if (mes1 > mes2 || (mes1 == mes2 && dia1 > dia2)) {
			System.out.println("O primeiro aniversariante é: " + nome2);
		} else {
			System.out.println("As duas pessoas fazem aniversário na mesma data!");
		}

		sc.close();
	}
}
