package Java_8_Feature;

@FunctionalInterface
interface A
{
	void show();
}

class B implements A
{
	public void show()
	{
		System.out.println("Normal Interface");
	}
}

public class Lambda_Expression {
	public static void main(String[] args) {
		
		A obj=()->System.out.println("Lambda Expression");
		obj.show(); //Lambda Expression
		System.out.println("-------------------------------");
		
//------------------------------------------------------------------------------------------		
		
		A obj2=new A()
				{
					public void show()
					{
						System.out.println("Java 7 Features");
					}
				};
		obj2.show(); //Java 7 Features
		System.out.println("-------------------------------");
		
//------------------------------------------------------------------------------------------
		
		A obj3=new B();
		obj3.show(); //Normal Interface		
		
	}

}
