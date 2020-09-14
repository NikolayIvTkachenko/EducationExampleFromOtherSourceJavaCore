package StreamsReactive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApp7 {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
		
		stream1.filter(e1 -> {
			System.out.println("!!!");
			return e1%2 == 0;
		}).collect(Collectors.toList());
		
		
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
		Stream<Integer> stream4 = Stream.of(6, 7, 8, 9, 10);
		Stream<Integer> stream5 = Stream.concat(stream3, stream4);
		stream5.forEach(System.out::println);
		
		Stream<Integer> stream6 = Stream.of(1,2,3,4,5, 1, 2, 3);
		System.out.println(stream6.count());
		
		//стримы нельзя периспользовать
		//stream6.distinct().forEach(System.out::println);
		//System.out.println(stream6.count());
		
		System.out.println("====");
		//peek like forEach, but intermetiate
		Stream<Integer> stream7 = Stream.of(1,2,3,4,5,1,2,3);
		System.out.println(stream7.distinct().peek(System.out::println).count());
		
		
		
		

	}

}
