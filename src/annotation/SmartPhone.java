package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //Если использовать SOURCE, CLASS не будет работать считывание данных из аннотация
public @interface SmartPhone {

	String OS() default "Android";
	int yearOfCompanyCreation() default 2010;
		
	
}
