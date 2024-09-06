package Java_8_Feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(6,5,3,6,5,9);
		
		int a=l.stream().sorted().filter(m->m%2==0).map(m->m*m).reduce(0, (c,d)->c+d);
		System.out.println(a);
		System.out.println("------------------------");
		
		l.stream().filter(m->m%2==0).map(m->m*m).forEach(m->System.out.println(m));
		System.out.println("------------------------");
		
		l.stream().filter(m->m%2==0).map(m->m*m).forEach(System.out::println);
		System.out.println("------------------------");
		
		List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("------------------------");

		List<Integer> l2=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println("------------------------");
		
		List<Integer> l3=l.reversed();
		System.out.println(l3);
		
	}

}
