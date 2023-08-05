package Lista00;

import java.util.Scanner;

public class Soma_Divisao {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 50;
        int contador = 0;
        double soma = 0;
//Processamento de soma dos 50 numeros
        while (contador < totalNumeros) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
            contador++;
        }
//Processamento do Calculo da media entre os 50 numeros inseridos
        double media = soma / totalNumeros;
        System.out.println("A média aritmética dos 50 números é: " + media);

        scanner.close();
    }
}

