package Lista00;

import java.util.Scanner;

public class CodigoProduto {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
//Entrada do Codigo
	        System.out.print("Digite o código do produto: ");
	        int codigo = scanner.nextInt();
//String de Retorno para o tipo de Produto
	        String Produto = "";
//Processamento do Codigo
	        if (codigo == 001) {
	            Produto = "Parafuso";
	        } else if (codigo == 002) {
	            Produto = "Porca";
	        } else if (codigo == 003) {
	            Produto = "Prego";
	        } else {
	           Produto = "Diversos";
	        }
//Saida do Resultado
	        System.out.println("O produto com código " + codigo + " é: " + Produto);
	        scanner.close();
	    }
}

