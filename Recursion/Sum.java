package Recursion;

public class Sum {
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	public static int sum(int num)
	{
		if(num==0||num==1)
		{
			return num;
		}
		return num+sum(num-1);
	}

}
