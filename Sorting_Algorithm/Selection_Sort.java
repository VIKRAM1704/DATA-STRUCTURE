package Sorting_Algorithm;

import java.util.Arrays;

public class Selection_Sort {
	public static void main(String[] args) {
		int a[]= {6,5,4,3,7,9,90};
		for(int i=0;i<a.length-1;i++)
		{
			int temp=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[temp]>a[j])
				{
					temp=j;		
				}
			}
			int temp2=a[temp];
			a[temp]=a[i];
			a[i]=temp2;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
