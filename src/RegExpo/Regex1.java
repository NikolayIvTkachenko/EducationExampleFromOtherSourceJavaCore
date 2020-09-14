package RegExpo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		
		String s = "Ivanov Vasiloy, Russia, Moscow, Lenin street, 53, Flat 48, " +
		 " email: vivan@mail.ru, postcode: AA99, Phone number: +123456789;" +
		 "Petrova Asya, Russia, Moscow, Orlov street, 37, Flat 23, " +
		 " email: apetrova@mail.ru, postcode: S234, Phone number: +234123678;" +
		 "Melnokov Micka, USA, Moscow, Dolgov street, 12, Flat 12, " +
		 " email: mickamelnikn@mail.ru, postcode: MM99, Phone number: +334455667;";
		
		Pattern pattern1 = Pattern.compile("\\w+");
		Matcher matcher1 = pattern1.matcher(s); 
		
		while(matcher1.find()) {
			System.out.println(matcher1.group());
		}
		
		System.out.println("=========");
		
		Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b");
		Matcher matcher2 = pattern2.matcher(s); 
		
		while(matcher2.find()) {
			System.out.println(matcher2.group());
		}
		
		System.out.println("=========");
		
		Pattern pattern3 = Pattern.compile("\\+\\d{9}");
		Matcher matcher3 = pattern3.matcher(s); 
		
		while(matcher3.find()) {
			System.out.println(matcher3.group());
		}
		
		System.out.println("=========");
		
		Pattern pattern4 = Pattern.compile("\\w+@\\w+\\.(ru|com)");
		Matcher matcher4 = pattern4.matcher(s); 
		
		while(matcher4.find()) {
			System.out.println(matcher4.group());
		}
		
		System.out.println("=========");
		
		String ss = "poka    abc    Nick   dom  uliza  borsacsasc";
		Pattern pattern5 = Pattern.compile("\\w\\s+\\w");
		Matcher matcher5 = pattern5.matcher(ss); 
		
		while(matcher5.find()) {
			System.out.println(matcher5.group());
		}
		
		System.out.println("=========");
		
		String sss = "abcd abce3 abcfa67abcgkkmabch";
		Pattern pattern6 = Pattern.compile("\\D{2,6}");
		Matcher matcher6 = pattern6.matcher(sss); 
		
		while(matcher6.find()) {
			System.out.println(matcher6.group());
		}
		
		System.out.println("=========");
		
		String ssss = "ABCABACABABDA";
		Pattern pattern7 = Pattern.compile("(AB){2,3}");
		Matcher matcher7 = pattern7.matcher(ssss); 
		
		while(matcher7.find()) {
			System.out.println(matcher7.group());
		}
		
		System.out.println("=========");

		
		String ssss1 = "DABCDABABFGDABABHDBCVHV";
		Pattern pattern8 = Pattern.compile("D(AB){2,}");
		Matcher matcher8 = pattern8.matcher(ssss1); 
		
		while(matcher8.find()) {
			System.out.println(matcher8.group());
		}
		
		System.out.println("=========");
		
		String ssss2 = "abcd abce abcderkfnvsd";
		Pattern pattern9 = Pattern.compile("\\Aabcd");
		Matcher matcher9 = pattern9.matcher(ssss2); 
		
		while(matcher9.find()) {
			System.out.println(matcher9.group());
		}
		
		System.out.println("=========");
		
		String ssss3 = "abcd abce abcderkfnvsd";
		Pattern pattern10 = Pattern.compile("nvsd\\Z");
		Matcher matcher10 = pattern10.matcher(ssss3); 
		
		while(matcher10.find()) {
			System.out.println(matcher10.group());
		}
		
		System.out.println("=========");
	}

}
