package MultiThreading;
class A implements Runnable
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

class B implements Runnable
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


public class Runnable1 {
	public static void main(String[] args) {
		
		Runnable obj1=new A();
		Thread t1=new Thread(obj1);
		t1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Runnable obj2=new B();
		Thread t2=new Thread(obj2);
		t2.start();
		
	}

}
