package Lista03;

import java.util.Scanner;

public class _25_Horario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora: ");
		int hora = sc.nextInt();

		System.out.print("Digite os minutos: ");
		int minutos = sc.nextInt();

		System.out.print("Digite os segundos: ");
		int segundos = sc.nextInt();

		boolean horarioValido = (hora >= 0 && hora <= 23) && (minutos >= 0 && minutos <= 59)
				&& (segundos >= 0 && segundos <= 59);

		if (horarioValido) {
			System.out.println("Horário válido!");
		} else {
			System.out.println("Horário inválido!");
		}

		sc.close();
	}
}
