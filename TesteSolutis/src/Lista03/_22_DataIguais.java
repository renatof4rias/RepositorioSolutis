package Lista03;

import java.util.Scanner;

public class _22_DataIguais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a data de aniversário da primeira pessoa:");
		System.out.print("Dia: ");
		int dia1 = sc.nextInt();
		System.out.print("Mês: ");
		int mes1 = sc.nextInt();

		System.out.println("Digite a data de aniversário da segunda pessoa:");
		System.out.print("Dia: ");
		int dia2 = sc.nextInt();
		System.out.print("Mês: ");
		int mes2 = sc.nextInt();

		if (dia1 == dia2 && mes1 == mes2) {
			System.out.println("As datas de aniversário são iguais!");
		} else {
			System.out.println("As datas de aniversário são diferentes.");
		}

		sc.close();
	}
}
