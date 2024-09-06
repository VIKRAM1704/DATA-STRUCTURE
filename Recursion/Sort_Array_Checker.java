package Recursion;

public class Sort_Array_Checker {
	public static void main(String[] args) {
		int []a= {9,7,6,2,5,8};
		int []b= {1,2,3,4,5};
		System.out.println(sort(a,0));
		System.out.println(sort(b,0));
	}
	public static boolean sort(int[]a,int index)
	{
		if(a.length-1 == index)
		{
			return true;
		}
		if(a[index]>a[index+1])
		{
			return false;
		}
		return sort(a,index+1);
	}
}
