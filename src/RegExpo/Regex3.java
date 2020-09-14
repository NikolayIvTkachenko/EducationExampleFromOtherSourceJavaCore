package RegExpo;

import java.util.Arrays;

public class Regex3 {

	public static void main(String[] args) {
		
		String s = "Ivanov Vasiloy, Russia, Moscow, Lenin street, 53, Flat 48, " +
				 " email: vivan@mail.ru, postcode: AA99, Phone number: +123456789;" +
				 "Petrova Asya, Russia, Moscow, Orlov street, 37, Flat 23, " +
				 " email: apetrova@mail.ru, postcode: S234, Phone number: +234123678;" +
				 "Melnokov Micka, USA, Moscow, Dolgov street, 12, Flat 12, " +
				 " email: mickamelnikn@mail.ru, postcode: MM99, Phone number: +334455667;";
		
		String s2 = "mickamelnikn@mail.ru";
		boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
		System.out.println("result = " + result);
		

		String[] array = s.split(" ");
		System.out.println("array = " + Arrays.toString(array));
		
	}

}
