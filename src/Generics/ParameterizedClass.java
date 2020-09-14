package Generics;

public class ParameterizedClass {
	
	public static void main(String[] args) {
		
		Info<String> info1 = new Info<>("privet");
		System.out.println(info1);
		String s = info1.getValue();
		
		Info<Integer> info2 = new Info<>(34);
		System.out.println(info2);
		Integer i = info2.getValue();
		
		
		//E - Element
		//K - Keys
		//V - Value
		//K, V -- Map <K, V>
		//T - TypePlaceholder
		
		//TYPE ERASURE
		//ArrayList all5 = new ArrayList();
		//int i = (Integer)all.get(0);  -- стирание типов
		
		
	}

	
//	public void abc(Info<String> info) {
//		String s = info.getValue();
//	}
//	
//	public void abc(Info<Integer> info) {
//		Integer i = info.getValue();
//	}
	//abc(Info info)
	
	
	
}

