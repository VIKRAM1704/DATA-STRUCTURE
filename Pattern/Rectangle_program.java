package Pattern;

public class Rectangle_program {
	public static void main(String[] args) {
		String a="program";
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(i+j==i)
				{
					System.out.print(a.charAt(i)+" ");
				}
				else if(i+j==j)
				{
					System.out.print(a.charAt(j)+" ");
				}
				else if(i+j==i+a.length()-1)
				{
					System.out.print(a.charAt(a.length()-i-1)+" ");
				}
				else if(i+j==j+a.length()-1)
				{
					System.out.print(a.charAt(a.length()-j-1)+" ");
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
