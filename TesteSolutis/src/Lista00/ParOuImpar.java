package Lista00;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//Valor de Entrada 
		System.out.print("Digite um Numero Inteiro: ");
		int numero = sc.nextInt();
//Processamento do Valor e Saida do Resultado		
		if (numero % 2 == 0) {
			System.out.print("O Numero Inserido e PAR");
		} else {
			System.out.print("O Numero Inserido e IMPAR");
		}
		
		
		
		sc.close();
	}

}
