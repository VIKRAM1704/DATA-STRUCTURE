package Sorting_Algorithm;

import java.util.Arrays;

public class Reverse_Bubble_Sort_SIngle_For_Loop {

	public static void main(String[] args) {
		int a[]= {64,34,25,12,22,11,90};
		for(int i=0;i<a.length-1;i++)
		{
				if(a[i]<a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					i=-1;
				}
		}
		System.out.println(Arrays.toString(a));

	}

}
