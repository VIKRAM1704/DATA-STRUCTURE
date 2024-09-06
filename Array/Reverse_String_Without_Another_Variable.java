package Array;

import java.util.Arrays;

public class Reverse_String_Without_Another_Variable {

	public static void main(String[] args) {
		String []a= {"H","e","l","l","o"};
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			String temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
