package Lista03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _58_QuantidadeDias {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite uma data (dd/MM/yyyy): ");
		String dataStr = sc.next();

		System.out.print("Digite a quantidade de dias para somar: ");
		int dias = sc.nextInt();

		try {
			Date data = sdf.parse(dataStr);
			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.add(Calendar.DATE, dias);
			Date novaData = cal.getTime();

			System.out.println("Nova data: " + sdf.format(novaData));
		} catch (ParseException e) {
			System.out.println("Data inválida. Certifique-se de digitar a data no formato dd/MM/yyyy.");
		}

		sc.close();
	}
}
