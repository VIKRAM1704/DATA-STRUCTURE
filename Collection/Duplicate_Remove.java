package Collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Duplicate_Remove {
	public static void main(String[] args) {
		List<String> ls=new LinkedList<>();
		ls.add("vikram");
		ls.add("vignesh");
		ls.add("vikram");
		ls.add("vikram");

		Set<String> s=new LinkedHashSet<>(ls);
		System.out.println(s);
	}

}
