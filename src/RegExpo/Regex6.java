package RegExpo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {

	public static void main(String[] args) {
		String str1 = "12345439587675861325689;"+"34565439587675861325232;"+"34566739587675861325782;";
		
		Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
		Matcher matcher = pattern.matcher(str1);
		
//		String str2 = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//		
//		System.out.println(str2);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(7));
			
		}

	}

}
