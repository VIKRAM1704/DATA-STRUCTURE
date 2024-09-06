package Previous;

import java.util.LinkedList;
import java.util.List;

public class upgrade_downgrade {

	public static void main(String[] args) {
		String a="9.0.23";
		String b="9.0.24";
		if(m1(a)==m1(b))
		{
			System.out.println("equals");
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
		List<Integer> ls=new LinkedList<>();
		String rev="";
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)!='.')
			{
				rev=rev+a.charAt(i);
			}
			else
			{
				ls.add(Integer.parseInt(rev));
				rev="";
			}
		}
		ls.add(Integer.parseInt(rev));
		
		for(int i=0;i<ls.size()-1;i++)
		{
			c=c+ls.get(i)*10+ls.get(i+1);
		}
		return c;
	}
	

}
