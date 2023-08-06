package Lista03;

import java.util.Scanner;

public class _26_Segundos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro horário (hh:mm:ss): ");
		String horario1 = sc.nextLine();

		System.out.print("Digite o segundo horário (hh:mm:ss): ");
		String horario2 = sc.nextLine();

		String[] partes1 = horario1.split(":");
		int hora1 = Integer.parseInt(partes1[0]);
		int minuto1 = Integer.parseInt(partes1[1]);
		int segundo1 = Integer.parseInt(partes1[2]);

		String[] partes2 = horario2.split(":");
		int hora2 = Integer.parseInt(partes2[0]);
		int minuto2 = Integer.parseInt(partes2[1]);
		int segundo2 = Integer.parseInt(partes2[2]);

		int segundosTotal1 = hora1 * 3600 + minuto1 * 60 + segundo1;
		int segundosTotal2 = hora2 * 3600 + minuto2 * 60 + segundo2;

		int diferencaSegundos = Math.abs(segundosTotal1 - segundosTotal2);

		System.out.println("A diferença entre os horários é de " + diferencaSegundos + " segundos.");

		sc.close();
	}

}
