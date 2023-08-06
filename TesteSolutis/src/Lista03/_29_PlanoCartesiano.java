package Lista03;

import java.util.Scanner;

public class _29_PlanoCartesiano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas do primeiro ponto (superior esquerdo):");
		System.out.print("X: ");
		double x1 = sc.nextDouble();
		System.out.print("Y: ");
		double y1 = sc.nextDouble();

		System.out.println("Digite as coordenadas do segundo ponto (inferior direito):");
		System.out.print("X: ");
		double x2 = sc.nextDouble();
		System.out.print("Y: ");
		double y2 = sc.nextDouble();

		if (x1 == x2 && y1 == y2) {
			System.out.println("Isso representa um ponto, não um retângulo.");
			sc.close();
			return;
		} else if (x1 == x2 || y1 == y2) {
			System.out.println("Isso representa uma reta.");
			sc.close();
			return;
		}

		double largura = Math.abs(x2 - x1);
		double altura = Math.abs(y2 - y1);
		double area = largura * altura;

		System.out.println("Área do retângulo: " + area);

		System.out.println("Digite as coordenadas de outro ponto:");
		System.out.print("X: ");
		double x3 = sc.nextDouble();
		System.out.print("Y: ");
		double y3 = sc.nextDouble();

		String posicao;

		if (x3 < x1 && y3 > y2) {
			posicao = "acima e à esquerda";
		} else if (x3 < x1 && y3 >= y1 && y3 <= y2) {
			posicao = "à esquerda";
		} else if (x3 < x1 && y3 < y1) {
			posicao = "embaixo e à esquerda";
		} else if (x3 >= x1 && x3 <= x2 && y3 > y2) {
			posicao = "acima";
		} else if (x3 >= x1 && x3 <= x2 && y3 < y1) {
			posicao = "embaixo";
		} else if (x3 > x2 && y3 > y2) {
			posicao = "acima e à direita";
		} else if (x3 > x2 && y3 >= y1 && y3 <= y2) {
			posicao = "à direita";
		} else if (x3 > x2 && y3 < y1) {
			posicao = "embaixo e à direita";
		} else {
			posicao = "dentro do retângulo";
		}

		System.out.println("A posição do ponto em relação ao retângulo é: " + posicao);

		sc.close();
	}

}
