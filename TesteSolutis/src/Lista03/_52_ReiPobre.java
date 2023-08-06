package Lista03;

public class _52_ReiPobre {
	public static void main(String[] args) {
		long quantidadeArroz = 0;

		for (int i = 1; i <= 64; i++) {
			quantidadeArroz += (long) Math.pow(2, i - 1);
		}

		System.out.println("Quantidade total de grãos de arroz: " + quantidadeArroz);

		double quantidadeSacos = quantidadeArroz / 64000.0; // Assumindo 64.000 grãos por saco
		System.out.println("Quantidade aproximada de sacos de arroz: " + quantidadeSacos);
	}
}
