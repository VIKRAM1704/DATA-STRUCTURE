package String;

public class Reverse_String {
	public static void main(String[] args) {
		String a="i do java programming everyday";
		String b[]=a.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}

}
