package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_Main {
	public static void main(String[] args) {
		List<Comparators> ls=new ArrayList<>();
		ls.add(new Comparators(2,"vikram",1000));
		ls.add(new Comparators(1,"vignesh",2000));
		ls.add(new Comparators(3,"vinitha",3000));
		Collections.sort(ls,new ComparatorMethod());
		System.out.println(ls);
	}

}
