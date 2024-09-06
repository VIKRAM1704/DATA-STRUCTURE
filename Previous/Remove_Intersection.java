package Previous;

import java.util.LinkedList;
import java.util.List;

public class Remove_Intersection {

	public static void main(String[] args) {
		String a="Every morning i want to do exercise";
		String b="Every morning i want to do exercise";
		String c="It is important that i want to be work";
		String d="";
		
		List<String> ls=m1(a);
		List<String> ls1=m1(a);
		List<String> ls2=m1(b);
		List<String> ls3=m1(c);
		ls.retainAll(ls2);
		ls.retainAll(ls3);
		
		String e="";
		String f="";
		String g="";
		
		ls1.removeAll(ls);
		ls2.removeAll(ls);
		ls3.removeAll(ls);
		
		for(int i=0;i<ls1.size();i++)
		{
			e=e+ls1.get(i)+" ";
		}
		
		for(int i=0;i<ls2.size();i++)
		{
			f=f+ls2.get(i)+" ";
		}
		
		for(int i=0;i<ls3.size();i++)
		{
			g=g+ls3.get(i)+" ";
		}
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}
	public static List<String> m1(String a)
	{
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
		return ls;
		
	}

}
