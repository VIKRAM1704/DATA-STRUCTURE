package Previous;

import java.util.LinkedList;
import java.util.List;

public class remove_palindrome {

	public static void main(String[] args) {
		String a="He is a good for malayalam";
		List<String> ls=new LinkedList<>();
		String rev="";
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)!=' ')
			{
				rev=rev+a.charAt(i);
			}
			else
			{
				ls.add(rev);
				rev="";
			}
		}
		ls.add(rev);
		System.out.println(ls);
		
		for(int i=0;i<ls.size();i++)
		{
			if(!m1(ls.get(i)))
			{
				System.out.print(ls.get(i)+" ");
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
		if(a.equalsIgnoreCase(rev))
		{
			return true;
		}
		return false;
	}
	

}
