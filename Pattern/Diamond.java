package Pattern;

public class Diamond {
	public static void main(String[] args) {
		String a="Program";
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(i+j==a.length()/2)
				{
					System.out.print(a.charAt(j)+" ");
				}
				else if(i+j==a.length()/2+2*i)
				{
					System.out.print(a.charAt(j)+" ");
				}
				else if(i+j==a.length()/2+2*j)
				{
					System.out.print(a.charAt(j)+" ");
				}
				else if(i+j==a.length()+2)
				{
					System.out.print(a.charAt(j)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
