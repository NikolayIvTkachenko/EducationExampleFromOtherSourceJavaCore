package RegExpo;

public class Regex5 {

	public static void main(String[] args) {
		
		String s1 = "Hello, How are you? How do you    study   Java?";
		System.out.println(s1);
		s1 = s1.replace("Java", "SQL");
		System.out.println(s1);
		
		s1 = s1.replaceAll(" {2,}", " ");
		System.out.println(s1);
		
		s1 = s1.replaceAll("\\bs\\w+", "education");
		System.out.println(s1);

		s1 = s1.replaceFirst("\\bH\\w+", "Freinds");
		System.out.println(s1);
	}

}
