package Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class Common_Element_3_3_Matrix {
	public static void main(String[] args) {
		int [][]a= {{1,2,4},{4,5,6},{1,8,2}};
		int [][]b= {{2,4,6},{1,7,5},{8,7,9}};
		Set<Integer> ls1=new LinkedHashSet<>();
		Set<Integer> ls2=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				ls1.add(a[i][j]);
				ls2.add(b[i][j]);
			}
		}
		ls1.retainAll(ls2);
		System.out.println(ls1);
	}

}
