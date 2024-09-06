package Sorting_Algorithm;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		int a[]= {9,8,7,6,5};
		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
