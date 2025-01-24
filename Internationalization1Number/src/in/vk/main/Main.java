package in.vk.main;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getCountry());
		System.out.println(locale.getLanguage());
		System.out.println();
		
		@SuppressWarnings("deprecation")
		Locale locale2 = new Locale("fr","FR");
		System.out.println(locale2);
		System.out.println(locale2.getDisplayCountry());
		System.out.println(locale2.getCountry());
		System.out.println(locale2.getLanguage());


	}

}
