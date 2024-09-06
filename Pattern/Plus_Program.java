package Pattern;

public class Plus_Program {

	public static void main(String[] args) {
		String a="program";
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(i+j ==(a.length()/2)+i )
				{
					System.out.print(a.charAt(i)+" ");
				}
				else if(i+j ==(a.length()/2)+j)
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
