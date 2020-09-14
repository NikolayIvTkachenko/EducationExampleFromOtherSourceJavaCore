package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		
		X x = new Y();
		//List<X> list1 = new ArrayList<Y>(); //-> not working
		List<X> list1 = new ArrayList<X>(); //-> working
		
	}

}
