package Array;

import java.util.Arrays;

public class Reverse_Array_without_another_container {
	public static void main(String[] args) {
		int a[]= {5,2,6,4,5};
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
