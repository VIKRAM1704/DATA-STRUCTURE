package Sorting_Algorithm;

import java.util.Arrays;

public class Merge_Sort {
	public static void main(String[] args) {
		int []a= {9,7,6,2,5,8};
		System.out.println(Arrays.toString(sort(a)));
	
	}
	public static int[] sort(int[]a)
	{
		if(a.length==1)
		{
			return a;
		}
		int range=a.length/2;
		int left[]=sort(Arrays.copyOfRange(a, 0, range));
		int right[]=sort(Arrays.copyOfRange(a, range, a.length));
		return merge(left,right);
		
	}
	public static int[] merge(int[] left, int[] right) {
		
		int []arr=new int[left.length+right.length];

		int i=0,j=0,k=0;
		while (j < left.length && k < right.length) {
            if (left[j] <= right[k]) {
                arr[i++] = left[j++];
            } else {
                arr[i++] = right[k++];
            }
        }

        while (j < left.length) {
            arr[i++] = left[j++];
        }

        while (k < right.length) {
            arr[i++] = right[k++];
        }
		return arr;
	}
	

}
