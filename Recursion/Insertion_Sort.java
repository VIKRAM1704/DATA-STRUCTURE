package Recursion;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		int a[]= {9,6,0,4,7};
		insertion(a, a.length);
		System.out.println(Arrays.toString(a));
	}
	
	public static void insertion(int[]a,int length)
	{
		if(length==1)
		{
			return;
		}
		insertion(a,length-1);
		
		int last=a[length-1];
		int j=length-2;
		
		while(0<=j && last<a[j])
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=last;
	}

}
