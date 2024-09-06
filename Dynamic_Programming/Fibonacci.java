package Dynamic_Programming;

public class Fibonacci {
	static Integer []a=new Integer[100];
	public static void main(String[] args) {
		System.out.println(fibo(7));
	}
	public static int fibo(int num) {
		if(a[num]!=null)
		{
			return a[num];
		}
		if(num==0||num==1)
		{
			return num;
		}
		a[num]=fibo(num-1)+fibo(num-2);
		return a[num];
		
	}

}
