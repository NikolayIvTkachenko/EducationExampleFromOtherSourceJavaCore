package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Test02 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class xiaomiClass = Class.forName("annotation.Xiaomi");
		
		Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
		SmartPhone sm1 = (SmartPhone)annotation1;
		
		System.out.println("Annotation info from Xiaomi class: " + 
				sm1.OS() + ", " + sm1.yearOfCompanyCreation()
		);

		
		Class iphoneClass = Class.forName("annotation.Iphone");
		
		Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
		SmartPhone sm2 = (SmartPhone)annotation2;
		
		System.out.println("Annotation info from Iphone class: " + 
				sm2.OS() + ", " + sm2.yearOfCompanyCreation()
		);
		
	}

}
