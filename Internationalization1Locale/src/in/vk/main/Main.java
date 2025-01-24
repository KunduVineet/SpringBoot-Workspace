package in.vk.main;

import java.util.Currency;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		Currency currency = Currency.getInstance(locale);
		System.out.println(currency.getSymbol()+"- "+currency.getDisplayName());
	}

}
