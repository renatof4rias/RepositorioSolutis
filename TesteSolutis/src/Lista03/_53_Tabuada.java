package Lista03;

import java.util.Scanner;

public class _53_Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para exibir sua tabuada: ");
		int numero = sc.nextInt();

		System.out.println("Tabuada do " + numero + ":");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

		sc.close();
	}
}
