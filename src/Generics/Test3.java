package Generics;

import java.util.ArrayList;
import java.util.List;

//WildCard

public class Test3 {

	public static void main(String[] args) {
		
		//List<Number> list1 = new ArrayList<Integer>(); //-> Not work
		//List<Object> list1 = new ArrayList<Integer>(); //-> Not work
		
		
		//? - Wild Card 
		List<?> list1 = new ArrayList<Integer>(); // является супер типом
		//instead ? - может быть любой тип
		
		//bounded wild card
		List<? extends Number> list11 = new ArrayList<Integer>();
		
		List<? super Number> list55 = new ArrayList<Number>();
		List<? super Number> list56 = new ArrayList<Object>();
		//Либо клавсс Number либо супер класс для Number
		
		
		
		List<Integer> list2 = new ArrayList();
		list2.add(4);
		list2.add(6);
		list2.add(7);
			
		List<String> list3 = new ArrayList();
		list3.add("privet");
		list3.add("Cancel");
		list3.add("Ok");
		
		showListInfo(list2);
		showListInfo(list3);
		
		
		
		//ArrayList Use!!!!!
		ArrayList<Double> list22 = new ArrayList<>();
		list22.add(4.4);
		list22.add(6.5);
		list22.add(7.2);
		System.out.println("summ = " + summ(list22));
	}
	
	static void showListInfo(List<?> list) {
		System.out.println("list : = " + list);
	}
	
	public static double summ(ArrayList<? extends Number> list) {
		double summ = 0;
		
		for(Number n : list) {
			summ += n.doubleValue();
		}
		
		
		return summ;
	}
	
}
