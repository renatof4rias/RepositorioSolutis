package Lista03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class _57_Calendario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite a primeira data (dd/MM/yyyy): ");
		String data1Str = sc.next();

		System.out.print("Digite a segunda data (dd/MM/yyyy): ");
		String data2Str = sc.next();

		try {
			Date data1 = sdf.parse(data1Str);
			Date data2 = sdf.parse(data2Str);

			List<Date> datasEntre = getDatasEntre(data1, data2);

			System.out.println("Datas entre " + data1Str + " e " + data2Str + ":");
			for (Date data : datasEntre) {
				System.out.println(sdf.format(data));
			}
		} catch (ParseException e) {
			System.out.println("Data inválida. Certifique-se de digitar a data no formato dd/MM/yyyy.");
		}

		sc.close();
	}

	private static List<Date> getDatasEntre(Date data1, Date data2) {
		List<Date> datasEntre = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(data1);

		while (cal.getTime().before(data2)) {
			datasEntre.add(cal.getTime());
			cal.add(Calendar.DATE, 1);
		}

		return datasEntre;
	}
}
