package Number;

public class Number_Replace {
	public static void main(String[] args) {
		int a=10001;
		String b=a+"";
		System.out.println(Integer.parseInt(b.replace('0', '5')));
	}

}
