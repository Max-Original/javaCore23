package practise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AplicationStreamApi {

	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("a1","a2","a3","a4","a5","a6","a7");
		
		//How to create streams
		Stream<String> s1 = collection.stream();
		
		Stream<String> s2 = Stream.of("1","2","3");
		
		String[] array = {"1","2","3"};
		Stream<String> s3 = Arrays.stream(array);
		
		Stream<Object> s4 = Stream.builder().add("1").add("2").add("3").build();
		
		
		//transit methods
		long count = collection.stream().filter("a1"::equals).count();
		System.out.println(count);
		
		String skip = collection.stream().skip(collection.size()-1).findFirst().orElse("1000");
		System.out.println(skip);
		
		List<String> distinged = collection.stream().distinct().collect(Collectors.toList());
		System.out.println("distinged"+distinged);
		
		List<String> map = collection.stream().map(s -> s +"<><>").collect(Collectors.toList());
		System.out.println(map);
		
		List<String> peek = collection.stream().map(x -> x.toUpperCase()).peek(run -> System.out.println(run)).collect(Collectors.toList());
		System.out.println(peek);
		
		List<String> limit = collection.stream().limit(2).collect(Collectors.toList());
		System.out.println(limit);
		
		List<String> sorted = collection.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted);
		
		String[] [] data = new String [] [] { {"a", "b"} , {"c","d"} ,{"e","f"}};
		System.out.println(Arrays.stream(data).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList()));
		
		Stream<String[]> arrayStream = Arrays.stream(data);
		Stream<String> flatMap = arrayStream.flatMap(x->Arrays.stream(x));
		List<String> flatMapFiltered = flatMap.filter(x -> "c".equals(x.toString())).collect(Collectors.toList());
		System.out.println(flatMapFiltered);
		
		//Termonal methods
		
		String orElse = collection.stream().findFirst().orElse("error");
		System.out.println(orElse);
		
		String orElse2 = collection.stream().findAny().orElse("error");
		System.out.println(orElse2);
		
		boolean anyMatch = collection.stream().anyMatch("a1"::equals);
		System.out.println(anyMatch);
		
		boolean noneMatch = collection.stream().noneMatch("a1"::equals);
		System.out.println(noneMatch);
		
		boolean allMatch = collection.stream().allMatch("a1"::equals);
		System.out.println(allMatch);
		
		String min = collection.stream().min(String::compareTo).get();
		System.out.println(min);
		
		String max = collection.stream().max(String::compareTo).get();
		System.out.println(max);
		
		String string = collection.stream().reduce((e1,e2) -> e1+e2).get();
		System.out.println(string);
		
	}

}
