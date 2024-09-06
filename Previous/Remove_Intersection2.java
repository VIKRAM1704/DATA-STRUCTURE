package Previous;

public class Remove_Intersection2 {
	public static void main(String[] args) {
		String a="every morning i want to do exercise";
		String b="every morning i want to do meditation";
		String c="It is important that i want to be work";
		String e[]=m1(a);
		String f[]=m1(b);
		String g[]=m1(c);
		
		int count1=m2(e,f);
		String h[]=new String[count1];
		h=m3(e,f,h);
		
		int count2=m2(h,g);
		String k[]=new String[count2];
		k=m3(h,g,k);
		
		e=m4(e,k);
		f=m4(f,k);
		g=m4(g,k);
		String res="";
		
		System.out.println(m5(e,res));
		System.out.println(m5(f,res));
		System.out.println(m5(g,res));		
	}

	public static int m2(String e[],String f[])
	{
		int count=0;
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<f.length;j++)
			{
				if(e[i].equals(f[j]))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static String[] m3(String[]e,String[]f,String[]h)
	{
		int v=0;
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<f.length;j++)
			{
				if(e[i].equals(f[j]))
				{
					h[v++]=e[i];
				}
			}
		}
		return h;
	}
	
	public static String[] m4(String[]e,String[]k)
	{
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<k.length;j++)
			{
				if(e[i].equals(k[j]))
				{
					e[i]="";
					
				}
			}
		}
		return e;
	}
	
	public static String m5(String[]e,String res)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!="")
			res=res+e[i]+" ";
		}
		return res;
	}
	
	public static String[] m1(String a)
	{
		String rev="";
		int count=1;
		for(int i=0;i<a.length();i++) 
		{	
			if(a.charAt(i)==' ')
			{
				count++;
			}
		}
		String b[]=new String[count];
		for(int i=0,j=0;i<a.length();i++) 
		{	
			if(a.charAt(i)!=' ')
			{
				rev=rev+a.charAt(i);
			}
			else
			{
				b[j++]=rev;
				rev="";
			}
		}
		b[b.length-1]=rev;
		return b;		
	}
}
