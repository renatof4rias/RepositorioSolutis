package Lista03;

import java.util.Scanner;

public class _07_Comissao {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o valor da despesa do cliente: ");
		        double despesaCliente = sc.nextDouble();

		        double comissao = despesaCliente * 0.1;
		        System.out.println("A comissão do garçom é: R$" + comissao);

		        sc.close();
		    }
}