package MultiThreading;

public class Runnable_With_LambdaExpression {
	public static void main(String[] args) {
		Thread t1=new Thread(() ->
								{
									for(int i=1;i<=5;i++)
									{
										System.out.println("vikram");
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
								});
		t1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t2=new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("markiv");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t2.start();
		
	}

}
