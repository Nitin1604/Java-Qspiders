class basicCode1
{
	public static void test()
	{
		System.out.println("This is executed from test method");
	}
	public void demo()
	{
		System.out.println("This is executed from demo method");
	}
	public static void main(String[] args)
	{
		System.out.println("This is executed from main method");
		basicCode1 c1=new basicCode1();
		c1.demo();
	}
}