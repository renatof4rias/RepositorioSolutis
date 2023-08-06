package Lista03;

import java.util.Scanner;

public class _51_Tribonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos da sequência de Tribonacci: ");
		int n = sc.nextInt();

		int termo1 = 1;
		int termo2 = 1;
		int termo3 = 2;

		System.out.print(termo1 + " " + termo2 + " " + termo3 + " ");

		for (int i = 4; i <= n; i++) {
			int proximoTermo = termo1 + termo2 + termo3;
			System.out.print(proximoTermo + " ");
			termo1 = termo2;
			termo2 = termo3;
			termo3 = proximoTermo;
		}

		sc.close();
	}

}
