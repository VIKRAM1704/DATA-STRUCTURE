package Sorting_Algorithm;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int a[]= {64,34,25,12,22,11,90};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
