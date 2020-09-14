package RegExpo;

import java.util.regex.Pattern;

public class Regex4_IP {
	
	
	void checkIp(String ip) {
		String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
				"(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
		
		//25[0-5]	|	2[0-4]\d	|	[01]?\d?\d	(\.)
		//250-255	|	200-249		|	0-199
		
		System.out.println(ip + " is OK?  " + Pattern.matches(regex, ip));
	}
	

	public static void main(String[] args) {
		
		//0-255.0-255.0-255.0-255
		String ip1 = "255.38.192.99";
		String ip2 = "255.262.91.05";
		
		Regex4_IP ip_check = new Regex4_IP();
		ip_check.checkIp(ip1);
		ip_check.checkIp(ip2);

	}

}
