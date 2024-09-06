package Collection;

import java.util.Comparator;

public class ComparatorMethod implements Comparator<Comparators>{

	@Override
	public int compare(Comparators o1, Comparators o2) {
		if(o1.getPrice()>o2.getPrice())
		{
			return 1;
		}
		return -1;
	}
	

}
