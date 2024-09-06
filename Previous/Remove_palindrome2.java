package Previous;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Remove_palindrome2 {

	public static void main(String[] args) {
		String a="He is a good for malayalam";
		String rev1="";
		int count=1;
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)==' ')
			{
				count++;
			}
		}
		
		String b[]=new String[count];
		for(int i=0,j=0;i<a.length();i++) {
					
			if(a.charAt(i)!=' ')
			{
				rev1=rev1+a.charAt(i);
			}
			else
			{
				b[j++]=rev1;
				rev1="";
			}
		}
		b[b.length-1]=rev1;
		
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<b.length;i++)
		{
			if(!m1(b[i]))
			{
				System.out.print(b[i]+" ");
			}
		}
				
	}
	public static boolean m1(String a)
	{
		String rev="";
		for(int i=0;i<a.length();i++)
		{
			rev=a.charAt(i)+rev;
		}
		if(a.equals(rev))
		{
			return true;
		}
		return false;
	}
}
