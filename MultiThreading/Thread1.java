package MultiThreading;

class A1 extends Thread
{
	public void run()
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
	}
}

class B1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Markiv");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Thread1 {
	public static void main(String[] args) {
		
		Thread t1=new A1();
		t1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread t2=new B1();
		t2.start();
		
	}

}