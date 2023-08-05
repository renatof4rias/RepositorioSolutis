package Lista01;

import java.util.Scanner;

public class _05_DiasDaSemana {
	public class DiaDaSemana {
	    public static void main(String[] args) {
//Array Contendo os Dias da Semana com o Valor Correspondente a sua Posicao 
	    	
	    	String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

	        Scanner sc = new Scanner(System.in);

//Entrada do Valor
	        System.out.print("Digite um número de 1 a 7: ");
	        int numero = sc.nextInt();

//Tratamento para chamar o dia da semana correspondente a posicao no Array 
	        if (numero >= 1 && numero <= 7) {
	            String dia = diasDaSemana[numero - 1];
	            System.out.println("O dia da semana correspondente ao número " + numero + " é: " + dia);
	        } else {
	            System.out.println("Número inválido. Digite um número de 1 a 7.");
	        }

	        sc.close();
	    }
	}
}
