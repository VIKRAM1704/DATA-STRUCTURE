package Sorting_Algorithm;

import java.util.Arrays;

public class Quick_Sort {
	public static void main(String[] args) {
		int a[]= {5,6,5,4,3,7,6,9,0};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	} 
	public static void sort(int []a,int low,int high)
	{
		if(high<=low)
		{
			return;
		}
		int start=low;
		int end=high;
		int mid=(start+end)/2;
		while(start<=end)
		{
			while(a[start]<a[mid])
			{
				start++;
			}
			while(a[end]>a[mid])
			{
				end--;
			}
			if(start<=end)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		sort(a,low,end);
		sort(a,start,high);
	}

}
