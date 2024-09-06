package String;

import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		String a="{[()]}";
		String b="{([)]}";
		System.out.println(parentheses(a));
		System.out.println(parentheses(b));
		
	}
	public static boolean parentheses(String a)
	{
		Stack<Character> s=new Stack<>();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='{' ||a.charAt(i)=='(' ||a.charAt(i)=='[')
			{
				s.push(a.charAt(i));
			}
			else if(a.charAt(i)=='}')
			{
				if(s.pop() != '{')
				{
					return false;
				}
			}
			else if(a.charAt(i)==')')
			{
				if(s.pop() != '(')
				{
					return false;
				}
			}
			else if(a.charAt(i)==']')
			{
				if(s.pop() != '[')
				{
					return false;
				}
			}
		}
		return true;
	}

}
