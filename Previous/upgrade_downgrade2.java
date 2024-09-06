package Previous;

import java.util.Arrays;

public class upgrade_downgrade2 {

	public static void main(String[] args) {
		String a="1.19.01.5";
		String b="1.19.1.5";
		if(m1(a)==m1(b))
		{
			System.out.println("equal");
		}
		else if(m1(a)<m1(b))
		{
			System.out.println("upgrade");
		}
		else
		{
			System.out.println("downgrade");
		}

	}
	public static int m1(String a)
	{
		int c=0;
		int count=1;
		String rev1="";
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)=='.')
			{
				count++;
			}
		}
		int b[]=new int[count];
		for(int i=0,j=0;i<a.length();i++) {
			
			if(a.charAt(i)!='.')
			{
				rev1=rev1+a.charAt(i);
			}
			else
			{
				b[j++]=m2(rev1);
				rev1="";
			}
		}
		b[b.length-1]=m2(rev1);
		for(int i=0;i<b.length;i++)
		{
			c=c*10+b[i];
		}
		return c;
	}
	
	public static int m2(String a)
	{
		int b=0;
		for(int i=0;i<a.length();i++)
		{
			b=b*10+a.charAt(i)-48;
		}
	return b;
	}
}
