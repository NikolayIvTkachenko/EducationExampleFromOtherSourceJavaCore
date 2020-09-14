package RegExpo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		String s1 = "ABCD ABCE ABCFABCGABCF";
		
		//Pattern pattern1 = Pattern.compile("ABCD");
		Pattern pattern1 = Pattern.compile("ABC");
		Matcher matcher = pattern1.matcher(s1);
		
		while(matcher.find()) {
			System.out.println("position: " + matcher.start() + "  " + matcher.group());
		}
		
		String s2 = "OMNABCDDSF";
		
		//Pattern pattern1 = Pattern.compile("ABCD");
		Pattern pattern2 = Pattern.compile("[ABC]");
		
		Pattern pattern3 = Pattern.compile("AB[C-F]OP");
		
		Pattern pattern4 = Pattern.compile("^AB");//начало строки
		Pattern pattern5 = Pattern.compile("AB$");//конец строки
		
		Pattern pattern6 = Pattern.compile("[0-9]");//найти цифру
		Pattern pattern7 = Pattern.compile("\\d");//найти цифру 0-9
		Pattern pattern8 = Pattern.compile("\\D");//найти цифру 0-9
		Pattern pattern9 = Pattern.compile("\\w");//найти цифру [A-Za-z0-9_]
		
		Matcher matcher2 = pattern2.matcher(s2);
		
		while(matcher2.find()) {
			System.out.println("position: " + matcher2.start() + "  " + matcher2.group());
		}

	}

}
