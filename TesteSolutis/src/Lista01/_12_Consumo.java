package Lista01;

import java.util.Scanner;

public class _12_Consumo {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int quilometragemTotal = 0;
	        int litrosTotal = 0;
	        int tanquesCheios = 0;

	        System.out.println("Digite -1 caso queira encerrar o programa.");
	        
	        while (true) {
	            System.out.print("Digite a quilometragem dirigida no tanque cheio: ");
	            int quilometragem = sc.nextInt();
	            if (quilometragem == -1) {
	                break;
	            }
	            
	            System.out.print("Digite a quantidade de litros de gasolina consumidos no tanque cheio: ");
	            int litros = sc.nextInt();
	            if (litros == -1) {
	                break;
	            }

	            double consumo = (double) quilometragem / litros;
	            System.out.printf("Consumo em quilômetros/litro no tanque cheio: %.2f%n", consumo);

	            quilometragemTotal += quilometragem;
	            litrosTotal += litros;
	            tanquesCheios++;
	        }

	        double consumoMedio = (double) quilometragemTotal / litrosTotal;
	        System.out.printf("Consumo médio em quilômetros/litro: %.2f%n", consumoMedio);
	        System.out.println("Quilometragem total combinada: " + quilometragemTotal);
	        System.out.println("Total de litros de combustível consumidos: " + litrosTotal);
	        System.out.println("Número de tanques cheios monitorados: " + tanquesCheios);

	        sc.close();
	}
}

