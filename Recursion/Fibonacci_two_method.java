package Recursion;

public class Fibonacci_two_method {
	public static void main(String[] args) {
		System.out.println(fibo(5));
	}
	static int count=0;
	public static int fibo(int num)
	{
		if(num==0 || num==1)
		{
			return num;
		}
		return fibo(num-1)+fibo(num-2);
	}
}
