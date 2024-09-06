package Array;

import java.util.Arrays;

public class Sort_Count_With_Element_Descending_Order {

	public static void main(String[] args) {
		int a[]= {1,1,2,4,4,5,5,5,6};
		int temp[]=Arrays.copyOfRange(a, 0, a.length);

		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count1++;
					a[j]=-1;
				}
			}
		}
		int b[]=new int[count1];
		int c[]=new int[count1];
		for(int i=0,k=0;i<a.length;i++)
		{
				if(a[i]!=-1)
				{
					b[k++]=a[i];
				}
		}

		for(int i=0,k=0;i<temp.length;i++)
		{
			int count2=1;
			for(int j=i+1;j<temp.length;j++)
			{
				if(temp[i]==temp[j] && temp[i]!=-1)
				{
					count2++;
					temp[j]=-1;
				}
			}
			if(temp[i]!=-1)
			{
				c[k++]=count2;
			}
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(c[i]<c[j])
				{
					int temp2=c[i];
					c[i]=c[j];
					c[j]=temp2;
					
					int temp3=b[i];
					b[i]=b[j];
					b[j]=temp3;
				}
			}
			System.out.println("element is "+b[i]+" - occurance is "+c[i]);
		}

	}

}
