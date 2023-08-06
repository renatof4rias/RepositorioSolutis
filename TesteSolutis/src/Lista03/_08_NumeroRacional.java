package Lista03;

import java.util.Scanner;

public class _08_NumeroRacional {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o numerador: ");
		        double numerador = sc.nextDouble();

		        System.out.print("Digite o denominador: ");
		        double denominador = sc.nextDouble();

		        if (denominador != 0) {
		            double resultado = numerador / denominador;
		            System.out.println("O número real correspondente é: " + resultado);
		        } else {
		            System.out.println("Denominador não pode ser zero! Divisão por zero não é permitida.");
		        }

		        sc.close();
	}
}
