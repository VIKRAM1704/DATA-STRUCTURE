package Array;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Sorting {
	public static void main(String[] args) {
		Integer a[]= {5,2,6,4,5};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

}
