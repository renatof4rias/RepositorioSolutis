package Lista01;

import java.util.Scanner;

public class _04_MilhasToQuilometros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//Entrada do Valor das Milhas
		System.out.print("Digite a distância em milhas: ");
		double milhas = scanner.nextDouble();

// Formular para converter para quilometros
		double quilometros = milhas * 1.609;

// Saida do Valor Convertido
		System.out.println(milhas + " milhas correspondem a " + quilometros + " quilômetros.");
		
		scanner.close();
	}
}