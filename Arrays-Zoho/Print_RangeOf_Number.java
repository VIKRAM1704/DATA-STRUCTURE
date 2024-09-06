package Arrays;

public class Print_RangeOf_Number {
	public static void main(String[] args) {
		int a[]= {4,3,7,11,50,1};
		int x=4;
		int y=10;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>4 && a[i]<10)
			{
				System.out.println(a[i]);
			}
		}
	}

}
