package Lista00;

import java.util.Scanner;

public class TrocaDeValor {
	 public static void main(String[] args) {
	
		 Scanner sc = new Scanner (System.in);
	
//Entrada dos Valores A e B
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		 
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt(); 
		 
//Variavel Auxiliar para Efetuar a Troca de Valores
		int C;
		
		
//Processamento de Troca de Valores		
		C = A;
		A = B;
		B = C;
//Saida dos Valores
		System.out.printf("Valores Trocados = A = " + A + ", B = " + B);
		 
		
		sc.close();
	 }
}
