class Vehicle
{
	static int x;
	double y;
	String z;
	public static void main(String[] args)
	{
		System.out.println("This is Vehicle class");
		System.out.println("x is: "+Vehicle.x);	
		Vehicle v1=new Vehicle();
		System.out.println("Y is: "+v1.y);
		System.out.println("z is: "+v1.z);
	}
}