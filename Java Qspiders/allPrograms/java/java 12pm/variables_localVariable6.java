class variables_localVariable6
{
	public static void main(String[] args)
	{			
		int x;
		{
			int y=50;
			x=93;
			System.out.println("Inside of the scope "+ " value of x is: "+x);
			System.out.println("Inside of the scope "+ " value of y is: "+y);
			x=123;
		}
		System.out.println("Outside of the scope "+ " value of x is: "+x);
	}
}

