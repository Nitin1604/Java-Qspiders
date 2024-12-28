class CarDriver
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println("Address of Car c1: " +c1);
		c1.test();
		System.out.println("============");
		System.out.println("Address of Car c2: " +c2);
		c2.test();
		System.out.println("============");
		System.out.println("Address of Car c3: " +c3);
		c3.test();
		System.out.println("============");
	}
}

