package Recursion;

import java.util.Scanner;

public class Fibonacci {
	static int n1=0;
	static int n2=1;
	static int n3=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number");
		int num=sc.nextInt()-2;
		System.out.print(n1+" "+n2);
		fibo(num);
		
	
	}
	public static void fibo(int num)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		if(num>0)
		{
			fibo(num-1);
		}
	}
}
