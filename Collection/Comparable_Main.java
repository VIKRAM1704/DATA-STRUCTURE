package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Main {
	public static void main(String[] args) {
		List<Comparables> ls=new ArrayList<>();
		ls.add(new Comparables(1, "vikram", 100000) );
		ls.add(new Comparables(3, "vignesh", 300000) );
		ls.add(new Comparables(4, "aswin", 400000) );
		ls.add(new Comparables(2, "austin", 200000) );
		
		Collections.sort(ls);
		System.out.println(ls);
	}

}
