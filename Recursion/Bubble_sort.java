package Recursion;

import java.util.Arrays;

public class Bubble_sort {
	public static void main(String[] args) {
		int a[]= {6,5,4,3,2,1};
		bubble(a,a.length);
		System.out.println(Arrays.toString(a));
	}

	public static void bubble(int a[],int length)
	{
		if(length==1)
		{
			return;
		}
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				count++;
			}
		}
		if(count==0)
		{
			return;
		}
		bubble(a,length-1);
	}

}
