package Lista00;

public class MultiplosDeTres {
	public static void main(String[] args) {
  //Utilizando tipo INT  
		System.out.println("Resultado da divisão por 2 dos múltiplos de 3:");
        for (int i = 1; i <= 100; i++) {
        	if (i % 3 == 0) {
                int resultadoInt = i / 2;
                System.out.println(i + " / 2 = " + resultadoInt);
            }
        }
//Utilizando tipo DOUBLE  
        System.out.println("\nResultado da divisão por 2 dos múltiplos de 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultadoDouble = (double) i / 2;
                System.out.println(i + " / 2 = " + resultadoDouble);
            }
        }
    }
}
