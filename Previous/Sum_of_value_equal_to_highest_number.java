package Previous;

public class Sum_of_value_equal_to_highest_number {

	public static void main(String[] args) {
		int[]a= {1,5,11,5};
		System.out.println(m1(a));

	}
	public static boolean m1(int [] a)
	{
		int highest=Integer.MIN_VALUE;
		int sum=0;
		
		for(int j=0;j<a.length;j++)
		{
			if(highest<a[j])
			{
				highest=a[j];
			}
				
		}	
		for(int i=0;i<a.length;i++)
		{
			if(highest!=a[i])
			{
				sum=sum+a[i];
			}
		}
		System.out.println(highest);
		System.out.println(sum);
		
		if(sum==highest)
		{
			return true;
		}
		return false;
		
	}

}
