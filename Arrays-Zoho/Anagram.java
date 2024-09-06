package Arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="cat";
		String b="act";
	
		char []ch1=a.toCharArray();
		char []ch2=b.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(new String(ch1).equalsIgnoreCase(new String(ch2)))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}

	}

}
