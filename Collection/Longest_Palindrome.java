package Collection;

public class Longest_Palindrome {
	public static void main(String[] args) {
		String a="goodmorningmadam";
		String c = null;
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=i;j<a.length();j++)
			{
				String d=a.substring(i, j+1);
				if(palindrome(d))
				{
					if(d.length()>count)
					{
					count=d.length();
					c=d;
					}
				}
			}
		}
		System.out.println(c);
	}
	
	public static boolean palindrome(String a)
	{
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(b.equals(a))
		{
			return true;
		}
		return false;
	}

}
