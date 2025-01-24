package in.vk.main;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		double no1 = 1234567890;
		double no2 = 987654.3021123;
		Locale locale = Locale.getDefault();
		
		NumberFormat nf1 = NumberFormat.getInstance(locale);
		System.out.println(nf1.format(no1));
		System.out.println(nf1.format(no2));

		


	}

}
