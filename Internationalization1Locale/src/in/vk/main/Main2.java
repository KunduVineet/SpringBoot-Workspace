package in.vk.main;

import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		
		Locale locale2 = new Locale("hi");
		String [] str = Locale.getISOCountries();
		for(String countryCode: str) {
			Locale locale = new Locale("",countryCode);
			System.out.println(countryCode + "-" + locale.getDisplayCountry() +"- "+ locale.getDisplayCountry(locale2));
		}
	}
}
