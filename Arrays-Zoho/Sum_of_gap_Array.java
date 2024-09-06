package Arrays;

public class Sum_of_gap_Array {

	public static void main(String[] args) {
		int gap=3;
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		for(int i=0;i<gap;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j+=gap)
			{
				sum=sum+a[j];
			}
			System.out.println(sum);
		}

	}

}
