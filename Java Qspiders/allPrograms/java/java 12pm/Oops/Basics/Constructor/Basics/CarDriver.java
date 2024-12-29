class CarDriver
{
	public static void main(String[] args)
	{
		System.out.println("This is Driver class" + " run from CarDriver.java file.");
		Car.test();
		Car c1=new Car();
		c1.start();
		System.out.println("=====================");
		Car c2=new Car();
		System.out.println("=====================");
		Car c3=new Car();
		System.out.println("=====================");
		Car c4=new Car();

	}
}

