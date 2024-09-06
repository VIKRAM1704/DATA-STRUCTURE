package Array;

import java.util.Arrays;
//sort desc
//odd number store in one array
//even number store in another array
//find the occurance both the array
public class Just_Integrate {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,4,3,2,1};
		System.out.println(Arrays.toString(a));
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		int count2=0;
		int count3=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]%2==0)
				{
					count2++;
				}
				else
				{
					count3++;
				}
		}
		int b[]=new int[count2];
		int c[]=new int[count3];
		for(int i=0,j=0,k=0;i<a.length;i++)
		{
				if(a[i]%2==0)
				{
					b[j++]=a[i];
				}
				else
				{
					c[k++]=a[i];
				}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		System.out.println("even array occurance");
				
		for(int i=0;i<b.length;i++)
		{
			int count4=1;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j] && b[i]!=-1)
				{
					count4++;
					b[j]=-1;
				}
			}
			if(b[i]!=-1)
			{
				System.out.println(b[i]+"-"+count4);
			}
		}
		
		System.out.println("odd array occurance");
		
		for(int i=0;i<c.length;i++)
		{
			int count5=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count5++;
					c[j]=-1;
				}
			}
			if(c[i]!=-1)
			{
				System.out.println(c[i]+"-"+count5);
			}
		}
		
}

}