package Array;

import java.util.Arrays;

public class Sum_Of_Target_Array {
	public static void main(String[] args) {
		int[]a= {2,7,11,6,15,4,5,3};
		int target=9;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Pairs wth sum 9:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+"+"+a[j]+"="+target);
				}
			}
		}
	}

}
