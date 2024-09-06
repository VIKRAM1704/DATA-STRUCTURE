package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_String {

	public static void main(String[] args) {
		String a="Hi How are you are you";
		int count=1;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				count++;
			}
		}
		Set<String> s=new LinkedHashSet();
		String arr[]=new String[count];
			String res="";
			for(int i=0,k=0;i<count & k<a.length();k++)
			{
				
				if(a.charAt(k)!=' ') {
					res+=a.charAt(k);
					
				}
				else
				{
					s.add(res);
					res="";
				}
			}
			arr[arr.length-1]=res;
		
		
		System.out.println(s);

	}

}
