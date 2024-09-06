package Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collection_Inside_Map {
	public static void main(String[] args) {
		Map<Integer,String> m=new LinkedHashMap<>();
		m.put(1, "vikram");
		m.put(2, "vignesh");
		m.put(3, "suriya");
		
		List<Map<Integer,String>> ls=new ArrayList<>();
		ls.add(m);

		System.out.println(ls);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m);
	}

}
